package org.bumblebee.service;

import org.bumblebee.entity.User;

import java.util.List;

public interface UserService {
    /*
    根据用户手机寻找用户
     */
    public User selectUserByIphone(String Iphone);
    /*
    改变用户登录状态，0为离线，1为在线，用于登录冲突判断
     */
    public void ChangeState(Integer userId,Integer State);
    /*
    用户登录
     */
    public User Login(String userIphone);
    /*
    用户注册
     */
    public Integer Regist(User user);
    /*
    获取用户拥有的房间权限列表
     */
    public List<Integer> getRoomIdList(Integer userId);
}
