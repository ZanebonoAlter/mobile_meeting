package org.bumblebee.controller;

import com.alibaba.fastjson.JSONObject;
import org.bumblebee.entity.Room;
import org.bumblebee.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/back/room")
public class RoomController {

    @RequestMapping(value = "/createRoom",method = RequestMethod.POST)
    public JSONObject createRoom(HttpSession session, String roomName,Integer roomLimit){
        JSONObject object = new JSONObject();
        User user = (User)session.getAttribute("user");
        Room room = new Room();
        room.setRoomCreateId(user.getUserId());
        room.setRoomName(roomName);
        room.setRoomLimit(roomLimit);

        object.put("code",1);
        return object;
    }
}
