package org.bumblebee.controller;

import com.alibaba.fastjson.JSONObject;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import org.bumblebee.WebSocket.WebSocketChat;
import org.bumblebee.entity.Room;
import org.bumblebee.entity.Sigin;
import org.bumblebee.entity.User;
import org.bumblebee.entity.Vote;
import org.bumblebee.service.RSAService;
import org.bumblebee.service.RoomService;
import org.bumblebee.service.SiginService;
import org.bumblebee.service.VoteService;
import org.bumblebee.until.RSAUntils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Base64;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/back/room")
public class RoomController {
    @Resource
    private RoomService roomService;
    @Resource
    private RSAService rsaService;
    @Resource
    private VoteService voteService;
    @Resource
    private SiginService siginService;
    //获取所有房间列表
    @RequestMapping(value = "/getRoomList",method = RequestMethod.GET)
    public JSONObject getRoomList(){
        JSONObject object = new JSONObject();
        List<Room> list = roomService.getAllRoom();
        //把密码设为状态值
        for (Room room:list){
            if(!room.getRoomPassword().equals(""))
                room.setRoomPassword("1");
            room.setCurrentUser(WebSocketChat.webSocketRoom.get(room.getRoomId()).size());//当前房间号对应在静态变量里所对应的房间列表大小
        }
        object.put("list",list);
        return object;
    }
    /*
    创建房间
     */
    @RequestMapping(value = "/createRoom",method = RequestMethod.POST)
    public JSONObject createRoom(HttpSession session, @RequestBody Room room_insert){
        JSONObject object = new JSONObject();
        User user = (User)session.getAttribute("user");
        Room room = new Room();
        room.setRoomState("正常");
        room.setRoomCreateId(user.getUserId());
        room.setRoomCreateTime(new Date());
        room.setRoomName(room_insert.getRoomName());
        room.setRoomLimit(room_insert.getRoomLimit());
        room.setRoomPassword(room_insert.getRoomPassword());
        roomService.createRoom(room);
        object.put("code",1);
        LinkedList<WebSocketChat> list = new LinkedList<>();
        WebSocketChat.webSocketRoom.put(room.getRoomId(),list);
        object.put("roomId",room.getRoomId());
        return object;
    }
    /*
    该方法已被废弃
     */
    @RequestMapping(value = "/joinRoom",method = RequestMethod.GET)
    public JSONObject joinRoom(HttpSession session,Integer roomId){
        JSONObject object = new JSONObject();
        User user = (User)session.getAttribute("user");
        session.setAttribute("roomId",roomId);
        object.put("code",1);
        return object;
    }
    /*
    更改房间状态
    首先判断是否有权限
    然后判断状态，0:关闭,1:开启;
     */
    @RequestMapping(value = "/changeState",method = RequestMethod.POST)
    public JSONObject changeState(HttpSession session,Integer roomId,Integer State){
        JSONObject object = new JSONObject();
        User user = (User)session.getAttribute("user");
        if(roomService.judgeRoomUser(roomId,user.getUserId())){
            roomService.updateRoomState(roomId,State);
            object.put("code",1);
        }else{
            object.put("code",0);
            object.put("message","没有权限");
        }
        return object;
    }
    /*
    更改房间最大人数
    首先判断是否有权限
    然后更改
     */
    @RequestMapping(value = "/changeLimit",method = RequestMethod.POST)
    public JSONObject changeLimit(HttpSession session,Integer roomId,Integer limit){
        JSONObject object = new JSONObject();
        User user = (User)session.getAttribute("user");
        if(roomService.judgeRoomUser(roomId,user.getUserId())){
            roomService.updateRoomLimit(roomId,limit);
            object.put("code",1);
        }else{
            object.put("code",0);
            object.put("message","没有权限");
        }
        return object;
    }
    //获取申请加入的房间权限
    //需要房间id，房间密码，申请人id
    @RequestMapping(value = "/passwordLogin",method = RequestMethod.GET)
    public JSONObject passwordLogin(@RequestParam Integer roomId,@RequestParam String password,@RequestParam Integer userId){
        JSONObject object = new JSONObject();
        RSAUntils untils = new RSAUntils();

        byte[] target = untils.transfer(password);
        String database_password = roomService.getRoomPassword(roomId);//获取数据库的房间密码
        if(null!=database_password&&database_password.equals(rsaService.decrypt(Base64.getDecoder().decode(target)))){
            object.put("code",1);//验证通过为1
            byte[] token = rsaService.encrypt((userId+","+roomId).getBytes());//userId,roomId形式公钥加密
//            System.out.println(rsaService.decrypt(token));
            object.put("token",Base64.getEncoder().encodeToString(token));
        }else{
            object.put("code",0);//验证失败为0
        }
        return object;
    }
    //获取当前房间信息
    @RequestMapping(value = "/getRoomInfo",method = RequestMethod.GET)
    public JSONObject getRoomInfo(@RequestParam Integer roomId){
        JSONObject object = new JSONObject();
        //返回房间总体信息，但是密码删除
        Room room = roomService.getRoomById(roomId);
        //区分密码是否需要，前端用来做下一步判断
        if(room.getRoomPassword().equals(""))
            room.setRoomPassword("");
        else
            room.setRoomPassword("1");
        object.put("roomInfo",room);
        //返回房间的正在进行中投票列表
        List<Vote> voteList = voteService.getVoteAvaliableByRoomId(roomId);
        object.put("voteList",voteList);
        //返回房间的可用的签到列表
        List<Sigin> siginList = siginService.getSiginAvaliableByRoomId(roomId);
        Sigin sigin = new Sigin();
        if(!siginList.isEmpty()){//如果不是空
            sigin=siginList.get(0);//设定每一个房间当前只有一个可用签到
        }
        object.put("sigin",sigin);

        return object;
    }
    //验证不是房主，需要密码的房间token
    @RequestMapping(value = "/verify",method = RequestMethod.GET)
    public JSONObject verify(@RequestParam String token,@RequestParam Integer userId,@RequestParam Integer roomId){
        JSONObject object = new JSONObject();
        if(token.equals("")){
            object.put("code",0);
            return object;
        }
        String result = rsaService.decrypt(Base64.getDecoder().decode(token.getBytes()));
        if(result.equals(userId+","+roomId)){
            object.put("code",1);
        }else{
            object.put("code",0);
        }
        return object;
    }
}
