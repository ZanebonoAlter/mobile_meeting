package org.bumblebee.service;

import org.bumblebee.entity.Admin;

public interface AdminService {
    public Admin Login(String account,String password);
}
