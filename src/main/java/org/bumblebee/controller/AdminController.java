package org.bumblebee.controller;

import com.alibaba.fastjson.JSONObject;
import org.bumblebee.entity.Admin;
import org.bumblebee.service.AdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/back/admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping("/login")
    public JSONObject Login(String account,String password){
        JSONObject object = new JSONObject();
        Admin admin = adminService.Login(account,password);
        if(admin==null){
            object.put("code",0);
            object.put("message","登录失败");
        }else{
            object.put("code",1);
            object.put("adminname",admin.getAdminUsername());
        }
        return object;
    }
}
