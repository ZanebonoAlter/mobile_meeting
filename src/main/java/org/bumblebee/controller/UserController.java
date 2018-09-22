package org.bumblebee.controller;

import com.alibaba.fastjson.JSONObject;
import org.bumblebee.entity.User;
import org.bumblebee.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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

    @RequestMapping(value = "/selectByIphone",method = RequestMethod.GET)
    public JSONObject selectByIphone(String iphone){
        JSONObject object = new JSONObject();
        object.put("user",userService.selectUserByIphone(iphone));
        return object;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public JSONObject Login(User user, HttpSession session){
        JSONObject object = new JSONObject();
        User user1 = userService.Login(user.getUserIphone(),user.getUserPassword());
        if(user1==null){
            object.put("code",0);
        }else{
            //应该返回名字和权限
            object.put("userName",user1.getUserName());

            object.put("code",1);
            session.setAttribute("user",user1);
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
    public JSONObject Regist(User user){
        JSONObject object = new JSONObject();
        userService.Regist(user);
        object.put("code",1);
        return  object;
    }


}
