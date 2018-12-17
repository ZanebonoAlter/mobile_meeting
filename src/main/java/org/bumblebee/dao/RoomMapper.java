package org.bumblebee.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.bumblebee.entity.Room;
import org.bumblebee.entity.RoomExample;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface RoomMapper {
    int deleteByPrimaryKey(Integer roomId);

    int insert(Room record);

    int insertSelective(Room record);

    List<Room> selectByExample(RoomExample example);

    Room selectByPrimaryKey(Integer roomId);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
}