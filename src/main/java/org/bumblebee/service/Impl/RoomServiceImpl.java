package org.bumblebee.service.Impl;

import org.bumblebee.dao.RoomMapper;
import org.bumblebee.dao.RoomuserMapper;
import org.bumblebee.entity.Room;
import org.bumblebee.entity.RoomExample;
import org.bumblebee.entity.Roomuser;
import org.bumblebee.entity.RoomuserExample;
import org.bumblebee.service.RoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Resource
    private RoomMapper roomMapper;
    @Resource
    private RoomuserMapper roomuserMapper;

    @Override
    public List<Room> getAllRoom() {
        RoomExample example = new RoomExample();
//        RoomExample.Criteria criteria = example.createCriteria();
        return roomMapper.selectByExample(example);
    }

    @Override
    public Room getRoomById(Integer roomId) {
        RoomExample example = new RoomExample();
        RoomExample.Criteria criteria = example.createCriteria();
        criteria.andRoomIdEqualTo(roomId);
        List<Room> list = roomMapper.selectByExample(example);
        if(!list.isEmpty()){
            return list.get(0);
        }
        return null;
    }

    @Override
    public Integer createRoom(Room room) {
        roomMapper.insertSelective(room);
        return room.getRoomId();
    }

    @Override
    public boolean judgeRoomUser(Integer roomId, Integer userId) {
        RoomuserExample example = new RoomuserExample();
        RoomuserExample.Criteria criteria = example.createCriteria();
        criteria.andRaRoomIdEqualTo(roomId);
        criteria.andRaUserIdEqualTo(userId);
        List<Roomuser> list = roomuserMapper.selectByExample(example);
        if (list.isEmpty()){
            return false;
        }
        return true;
    }

    @Override
    public void updateRoomState(Integer roomId, Integer State) {
        Room room = new Room();
        room.setRoomId(roomId);
        if(State==1){
            room.setRoomState("正常");
        }else{
            room.setRoomState("关闭");
        }
        roomMapper.updateByPrimaryKeySelective(room);
    }

    @Override
    public void updateRoomLimit(Integer roomId, Integer limit) {
        Room room = new Room();
        room.setRoomId(roomId);
        room.setRoomLimit(limit);
        roomMapper.updateByPrimaryKeySelective(room);
    }

    @Override
    public String getRoomPassword(Integer roomId) {
        RoomExample example = new RoomExample();
        RoomExample.Criteria criteria = example.createCriteria();
        criteria.andRoomIdEqualTo(roomId);
        List<Room> list = roomMapper.selectByExample(example);
        if(list.isEmpty())
            return null;
        else{
            return list.get(0).getRoomPassword();
        }
    }
}
