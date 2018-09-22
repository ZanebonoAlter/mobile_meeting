package org.bumblebee.service;

import org.bumblebee.entity.User;

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
    public User Login(String userIphone,String userPassword);
    /*
    用户注册
     */
    public Integer Regist(User user);
}
