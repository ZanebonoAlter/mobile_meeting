package org.bumblebee.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.bumblebee.entity.Room;
import org.bumblebee.entity.RoomExample;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface RoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Sat Sep 15 16:03:14 CST 2018
     */
    int countByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Sat Sep 15 16:03:14 CST 2018
     */
    int deleteByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Sat Sep 15 16:03:14 CST 2018
     */
    int deleteByPrimaryKey(Integer roomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Sat Sep 15 16:03:14 CST 2018
     */
    int insert(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Sat Sep 15 16:03:14 CST 2018
     */
    int insertSelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Sat Sep 15 16:03:14 CST 2018
     */
    List<Room> selectByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Sat Sep 15 16:03:14 CST 2018
     */
    Room selectByPrimaryKey(Integer roomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Sat Sep 15 16:03:14 CST 2018
     */
    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Sat Sep 15 16:03:14 CST 2018
     */
    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Sat Sep 15 16:03:14 CST 2018
     */
    int updateByPrimaryKeySelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbggenerated Sat Sep 15 16:03:14 CST 2018
     */
    int updateByPrimaryKey(Room record);
}