package org.bumblebee.service.Impl;

import org.bumblebee.dao.SiginMapper;
import org.bumblebee.dao.SigindetailMapper;
import org.bumblebee.entity.*;
import org.bumblebee.service.SiginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SiginServiceImpl implements SiginService {
    @Resource
    private SiginMapper siginMapper;
    @Resource
    private SigindetailMapper sigindetailMapper;
    @Override
    public Integer createSigin(Integer userId, Integer roomId) {
        Sigin sigin = new Sigin();
        sigin.setSiginUserId(userId);
        sigin.setSiginRoomId(roomId);
        sigin.setSiginDate(new Date());
        siginMapper.insertSelective(sigin);
        return sigin.getSiginId();
    }

    @Override
    public void endSigin(Integer siginId) {
        Sigin sigin = siginMapper.selectByPrimaryKey(siginId);
        sigin.setSiginState(0);
        siginMapper.updateByPrimaryKeySelective(sigin);
    }

    @Override
    public List<Sigin> getSiginAvaliableByRoomId(Integer roomId) {
        SiginExample example = new SiginExample();
        SiginExample.Criteria criteria = example.createCriteria();
        criteria.andSiginRoomIdEqualTo(roomId);
        criteria.andSiginStateEqualTo(1);
        return siginMapper.selectByExample(example);
    }

    @Override
    public List<User> getSiginUserBySiginId(Integer siginId) {
        List<User> list = new ArrayList<>();
        SigindetailExample example = new SigindetailExample();
        SigindetailExample.Criteria criteria = example.createCriteria();
        criteria.andSdSiginIdEqualTo(siginId);
        List<Sigindetail> list1 = sigindetailMapper.selectExtendUserByExample(example);
        for (Sigindetail sigin:list1
             ) {
            list.add(sigin.getUser());
        }
        if(list.isEmpty())
            return null;
        return list;
    }

    @Override
    public List<Sigin> getSiginOverView(Integer roomId) {
        SiginExample example = new SiginExample();
        SiginExample.Criteria criteria = example.createCriteria();
        criteria.andSiginRoomIdEqualTo(roomId);
        return siginMapper.selectExtendByExample(example);
    }
}
