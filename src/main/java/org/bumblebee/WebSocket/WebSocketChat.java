package org.bumblebee.WebSocket;

import org.bumblebee.entity.User;
import org.bumblebee.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/*
 * 获取HttpSession的配置类
 * 只要在websocket类上@ServerEndpoint注解中加入configurator=GetHttpSessionConfigurator.class
 * 再在 @OnOpen注解的方法里加入参EndpointConfig config
 * 通过config得到httpSession
 */
@ServerEndpoint(value="/back/websocket/{roomId}" ,configurator=GetHttpSessionConfigurator.class)//得到httpSession
@Component
public class WebSocketChat {
    //容器
    private static ApplicationContext applicationContext;
    //静态变量，用来记录当前在线连接数。应该把它设计成线程安全的,也不需要了直接根据房间的map去拿就行了
    //private static int onlineCount = 0;

    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。若要实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key可以为用户标识
    //没用的，该换新技术了
    // private static CopyOnWriteArraySet<WebSocketChat> webSocketSet = new CopyOnWriteArraySet<WebSocketChat>();

    //ConcurrentHashMap包的线程安全Map，每个key-value拥有独立的锁机制，大大减少了不同线程对资源的争夺
    //synchronized是对对象操作锁，不建议使用，贼慢
    //CopyOnWriteArrayList同样也是线程安全类，与Vector不同，Vector是直接加synchronized，速度超慢的
    //这里key是房间id，value是连接实体类对象
    //因为map get 不存在的key返回null，所以不用去单独搞一个监听器去数据库查询做初始化操作，直接get put就完事儿了
    //想了想觉得没必要list也做线程安全，因为都是分别获取去拿List，增加删除比较多，改用LinkedList
    //因为获取当前数量时用get必须用线程安全，否则cpu100%会卡死
    //需要把对websocketroom的操作放到同一个类中，对这个类上锁,否则会出现多线程的脏数据
    public static  ConcurrentHashMap<Integer, LinkedList<WebSocketChat>> webSocketRoom= new ConcurrentHashMap<>();

    //从http升级到websocket时从session中获取信息
    private Session session;

    //当前会话的httpession
    private HttpSession httpSession;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    //因为HttpSession生命周期，WebSocket是长连接，会出现用户名丢失的情况，因此将用户名保存到WebSocket对象中，这里暂时是不需要了
    //private String username;
    //改为保存用户实体类
    private User user;
    //另外保存房间id
    private Integer roomId;

    /**
     * 连接建立成功调用的方法
     * @param session  可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
     * @param config   有
     */
    @OnOpen
    public void onOpen(Session session, EndpointConfig config, @PathParam("roomId") Integer getroomId){
        //得到httpSession
        this.httpSession = (HttpSession) config.getUserProperties()
                .get(HttpSession.class.getName());
        this.session = session;

        //我用拦截器好了，这里直接去判断session挺蠢得
        //前端我一个vue路由好了，挺菜的
        /*if(this.httpSession.getAttribute("username")==null||this.httpSession.getAttribute("username")==""){
            this.httpSession.setAttribute("username","");
            this.activeOnClose("非法登入");
        }*/

            //新增的登陆冲突判断
            this.JudgeOnline(httpSession);
            this.user=(User) this.httpSession.getAttribute("user");//保存用户名
            this.roomId = getroomId;//保存房间id
            //this.changeOnline();//改变在线

            //更新了map中对应的房间，连接 list
            //方法为线程锁
            new_websocket(roomId);

            //发送新连接消息，调用获取在线用户方法
            LinkedList<WebSocketChat> list = webSocketRoom.get(roomId);

            for(WebSocketChat item: list){
                try {
                    item.sendMessage(user.getUserName()+"进入了房间");
                } catch (IOException e) {
                    e.printStackTrace(); continue;
                }
            }
        }
    public void changeOnline(){
        UserService userService =  applicationContext.getBean(UserService.class);
        userService.ChangeState(this.user.getUserId(),1);
//        LoginService loginService = SpringContextUtils.getBean("LoginService");
//        loginService.ChangeOnline(this.username);
    }
    public void changeOffline(){
        UserService userService =  applicationContext.getBean(UserService.class);
        userService.ChangeState(this.user.getUserId(),0);
//        LoginService loginService = SpringContextUtils.getBean("LoginService");
//        loginService.ChangeOffline(this.username);
    }
    /**
     * 连接关闭调用的方法
     */
    //客户端主动断开
    @OnClose
    public void onClose(){

        //this.changeOffline();//用户离线
        remove_websocket(this.roomId);//删除用户
        LinkedList<WebSocketChat> list = webSocketRoom.get(roomId);
        //发送连接断开消息，调用获取在线用户方法
        for(WebSocketChat item: list){
            try {
                item.sendMessage(this.user.getUserName()+"离开了房间");
            } catch (IOException e) {
                e.printStackTrace(); continue;
            }
        }
       // System.out.println("有一连接关闭！当前在线人数为" + getOnlineCount());
    }
    //因为重复登陆的服务端主动断开
    public void activeOnClose(String description){
        //尝试关闭连接
        try {
            this.sendMessage("text_message:"+description);
            this.session.close();//会触发上面的onclose注解方法
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("session关闭！原因:"+description);
    }
    /**
     * 收到客户端消息后调用的方法
     * @param message 客户端发送过来的消息
     * @param session 可选的参数
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        //获得消息发来时间
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sd.format(new Date());
    //解决了容器问题，这里可以直接调用Service 方法写入数据库
   //     SendService sendService = applicationContext.getBean(SendService.class);
   //     sendService.insertRecord(this.username,message);
        System.out.println("来自客户端的消息:" + message);
//        //替换表情
//        message = replaceImage(message);

        LinkedList<WebSocketChat> list = webSocketRoom.get(roomId);
        //如果是text_message,则群发消息
        if(message.indexOf("text_message:")!=-1){
            for(WebSocketChat item: list){
                try {
                    item.sendMessage(message+this.user.getUserName()+" "+time+"</br>");
                } catch (IOException e) {
                    e.printStackTrace(); continue;
                }
            }
        }else{//信令传输，绝壁不能传给自己，否则会状态出错
            //另外数据为json格式，不做修改
            for(WebSocketChat item: list){
                try {
                    if(item!=this) {//不是自己的话就传输
                        item.sendMessage(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace(); continue;
                }
            }
        }
    }
    /** * 发生错误时调用
     * @param session
     * @param error
     * @OnError
     */
    @OnError
    public void onError(Session session, Throwable error){
        System.out.println("发生错误");
        error.printStackTrace();
    }
    /** * 这个方法与上面几个方法不一样。没有用注解，是根据自己需要添加的方法。
     * @param message
     * @throws IOException
     */
    public void sendMessage(String message) throws IOException{
        this.session.getBasicRemote().sendText(message);
        //this.session.getAsyncRemote().sendText(message);
    }
    public void sendMessage(String message,String userid) throws IOException{ }
    //对count的加减获取同步
    public static synchronized int getOnlineCount(Integer roomId) {
        LinkedList<WebSocketChat> list = webSocketRoom.get(roomId);
        if(list==null){
            return 0;
        }else{
            return  list.size();
        }
    }
    /*
        方法为线程锁，根据roomId去把自身加进map对应的房间中
     */
    public synchronized void new_websocket(Integer roomId){
        //这里根据roomId获取具体的连接List信息
        LinkedList<WebSocketChat> list = webSocketRoom.get(roomId);
        if(list==null){//如果没创建房间，这个判断没办法，一定要做，不然就是null.add会报错
            list=new LinkedList<>();
        }
        list.add(this);//更新列表
        webSocketRoom.put(roomId,list);//更新对应的房间，覆盖
    }
    public synchronized void remove_websocket(Integer roomId){
        LinkedList<WebSocketChat> list = webSocketRoom.get(roomId);
        list.remove(this);
        webSocketRoom.put(roomId,list);
    }
//    //替换表情
//    private String replaceImage(String message){
//        for(int i=1;i<11;i++){
//            if(message.contains("<:"+i+":>")){
//                message = message.replace("<:"+i+":>", "<img " + "src='/chat/Images/" + i + ".gif' id='" + i + "' />");
//            }
//        }
//        return message;
//    }
    //登陆冲突处理
    public void JudgeOnline(HttpSession httpSession){
        LinkedList<WebSocketChat> list = webSocketRoom.get(this.roomId);
        for(WebSocketChat webSocketChat: list){
//            if(webSocketChat.httpSession.getAttribute("username").equals(httpSession.getAttribute("username"))){
//                webSocketChat.httpSession.setAttribute("username","");
//                webSocketChat.activeOnClose("重复登录");
//            }
            if(webSocketChat.user.getUserName().equals(((User)httpSession.getAttribute("user")).getUserName())){
                webSocketChat.httpSession.setAttribute("user","");
                webSocketChat.activeOnClose("重复登录");
            }
        }
    }
    public static void setApplicationContext(ApplicationContext Context){
        applicationContext=Context;
    }
}