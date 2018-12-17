package org.bumblebee.service.Impl;

import org.bumblebee.dao.AdminMapper;
import org.bumblebee.entity.Admin;
import org.bumblebee.entity.AdminExample;
import org.bumblebee.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin Login(String account, String password) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdminAccountEqualTo(account);
        criteria.andAdminPasswordEqualTo(password);
        List<Admin> list=adminMapper.selectByExample(example);
        if(!list.isEmpty()){
            return list.get(0);
        }
        return null;
    }
}
