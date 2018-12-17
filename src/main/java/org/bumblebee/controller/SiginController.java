package org.bumblebee.controller;

import com.alibaba.fastjson.JSONObject;
import org.bumblebee.entity.Sigin;
import org.bumblebee.entity.User;
import org.bumblebee.service.RoomService;
import org.bumblebee.service.SiginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/*
心情好改用Cookie,不想改.
 */
@RestController
@RequestMapping("/back/sigin")
public class SiginController {
    @Resource
    private SiginService siginService;
    @Resource
    private RoomService roomService;
    /*
    创建签到
     */
    @RequestMapping(value = "/createSigin",method = RequestMethod.POST)
    public JSONObject createSigin(HttpSession session,Integer roomId){
        JSONObject object = new JSONObject();
        User user = (User) session.getAttribute("user");
        if(roomService.judgeRoomUser(roomId,user.getUserId())){
            Integer siginId = siginService.createSigin(user.getUserId(),roomId);
            object.put("code",1);
            object.put("siginId",siginId);
        }else{
            object.put("code",0);
            object.put("message","没有权限");
        }
        return object;
    }
    /*
    显示可用签到
     */
    @RequestMapping(value = "/getActiveSigin",method = RequestMethod.GET)
    public JSONObject getActiveSigin(Integer roomId){
        JSONObject object = new JSONObject();
        List<Sigin> list=siginService.getSiginAvaliableByRoomId(roomId);
        object.put("siginList",list);
        object.put("code",1);
        return object;
    }
    /*
    获取某一签到具体情况
     */
    @RequestMapping(value="/getSiginUserList",method = RequestMethod.GET)
    public JSONObject getSiginUserList(Integer siginId){
        JSONObject object = new JSONObject();
        List<User> list=siginService.getSiginUserBySiginId(siginId);
        object.put("userList",list);
        object.put("code",1);
        return object;
    }
    /*
    签到统计
    扩展一下最好用分页，不过前台不行的话就那样吧
     */
    @RequestMapping(value = "/getSiginOverView",method = RequestMethod.GET)
    public JSONObject getSiginOverView(Integer roomId){
        JSONObject object = new JSONObject();
        List<Sigin> list=siginService.getSiginOverView(roomId);
        object.put("siginList",list);
        object.put("code",1);
        return object;
    }
    /*
    签到结束
     */
    @RequestMapping(value = "/endSigin",method = RequestMethod.POST)
    public  JSONObject endSigin(Integer siginId){
        JSONObject object = new JSONObject();
        siginService.endSigin(siginId);

        return object;
    }
}