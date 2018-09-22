package org.bumblebee.service.Impl;

import org.bumblebee.dao.UserMapper;
import org.bumblebee.entity.User;
import org.bumblebee.entity.UserExample;
import org.bumblebee.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User selectUserByIphone(String Iphone) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserIphoneEqualTo(Iphone);
        List<User> users = userMapper.selectByExample(example);
        if (users.isEmpty())
            return null;
        return users.get(0);
    }

    @Override
    public void ChangeState(Integer userId, Integer State) {
        User user = new User();
        user.setUserId(userId);
        user.setUserState(State);
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User Login(String userIphone, String userPassword) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserIphoneEqualTo(userIphone);
        criteria.andUserPasswordEqualTo(userPassword);
        List<User> users = userMapper.selectByExample(example);
        if (users.isEmpty()){
            return null;
        }
        return users.get(0);
    }

    @Override
    public Integer Regist(User user) {
        userMapper.insertSelective(user);
        return user.getUserId();
    }
}
