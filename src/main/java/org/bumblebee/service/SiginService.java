package org.bumblebee.service;

import org.bumblebee.entity.Sigin;
import org.bumblebee.entity.User;

import java.util.List;

public interface SiginService {
    /*
    创建签到,改mapper拿id,时间在实现类初始化
     */
    public Integer createSigin(Integer userId,Integer roomId);
    /*
    签到结束
     */
    public void endSigin(Integer siginId);
    /*
    根据房间id获取可用签到
     */
    public List<Sigin> getSiginAvaliableByRoomId(Integer roomId);
    /*
    根据签到id获取签到情况
     */
    public List<User> getSiginUserBySiginId(Integer siginId);
    /*
    获取往期签到总览
     */
    public List<Sigin> getSiginOverView(Integer roomId);
}
