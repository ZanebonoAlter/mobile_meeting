package org.bumblebee.service;

import org.bumblebee.entity.Room;

import java.util.List;

public interface RoomService {
    /**
     * 获取所有房间
     * @return
     */
    public List<Room> getAllRoom();
    /*
    获取指定房间
     */
    public Room getRoomById(Integer roomId);
    /*
    创建房间
     */
    public Integer createRoom(Room room);
    /*
    判断用户是否拥有房主权限
     */
    public boolean judgeRoomUser(Integer roomId,Integer userId);
    /*
    改变房主用户选择的房间状态
     */
    public void updateRoomState(Integer roomId,Integer State);
    /*
    改变房间限制人数
     */
    public void updateRoomLimit(Integer roomId,Integer limit);
    //获取房间密码
    public String getRoomPassword(Integer roomId);
}
