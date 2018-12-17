package org.bumblebee.controller;

import com.alibaba.fastjson.JSONObject;
import org.bumblebee.entity.User;
import org.bumblebee.service.RSAService;
import org.bumblebee.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Base64;
import java.util.List;

/*
这个控制器的所有返回信息需要公钥加密
考虑用jwt代替session，不然连接失效就很难弄
另外登录信息后面放在cookie里面，并且专门设置数据库存储cookie
防止session丢失
 */
@RestController
@RequestMapping("/back/user")
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private RSAService rsaService;

    @RequestMapping(value = "/selectByIphone",method = RequestMethod.GET)
    public JSONObject selectByIphone(String iphone){
        JSONObject object = new JSONObject();
        object.put("user",userService.selectUserByIphone(iphone));
        return object;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public JSONObject Login(@RequestBody User user, HttpSession session){
        JSONObject object = new JSONObject();
        //传输转换
        user.setUserIphone(user.getUserIphone().replace(" ","+"));
        user.setUserPassword(user.getUserPassword().replace(" ","+"));
        byte[] userIphone = user.getUserIphone().getBytes();
        byte[] userPassword = user.getUserPassword().getBytes();
        String password = rsaService.decrypt(Base64.getDecoder().decode(userPassword));

        User user1 = userService.Login(rsaService.decrypt(Base64.getDecoder().decode(userIphone)));

        if(user1==null){
            object.put("code",0);
        }else{
            if (rsaService.decrypt(Base64.getDecoder().decode(user1.getUserPassword())).equals(password)){
                //应该返回名字和权限
                object.put("userName",user1.getUserName());
                object.put("userId",user1.getUserId());
                List<Integer> roomIdList = userService.getRoomIdList(user1.getUserId());
                object.put("roomIdList",roomIdList);
                object.put("code",1);
                session.setAttribute("user",user1);
            }else{
                object.put("code",0);
            }
        }
        return object;
    }

    @RequestMapping(value = "/chooseRoom",method = RequestMethod.GET)
    public  JSONObject ChooseRoom(Integer roomId,HttpSession session){
        JSONObject object = new JSONObject();
        session.setAttribute("roomId",roomId);
        object.put("code",1);
        return object;
    }

    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public JSONObject Regist(@RequestBody User user){
        JSONObject object = new JSONObject();
        //把用户名还原
        user.setUserIphone(user.getUserIphone().replace(" ","+"));
        byte[] userIphone = user.getUserIphone().getBytes();
        user.setUserIphone(rsaService.decrypt(Base64.getDecoder().decode(userIphone)));
        //昵称还原
        user.setUserName(user.getUserName().replace(" ","+"));
        byte[] userName = user.getUserName().getBytes();
        user.setUserName(rsaService.decrypt(Base64.getDecoder().decode(userName)));

        userService.Regist(user);
        object.put("code",1);
        return  object;
    }


}
