package org.bumblebee.service.Impl;

import org.bumblebee.dao.RoomMapper;
import org.bumblebee.entity.Room;
import org.bumblebee.service.RoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    private RoomMapper roomMapper;
    @Override
    public Integer createRoom(Room room) {
        roomMapper.insertSelective(room);
        return room.getRoomId();
    }
}
