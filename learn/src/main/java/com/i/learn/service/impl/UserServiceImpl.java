package com.i.learn.service.impl;

import com.i.learn.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public Integer getUserCount() {
        return 1;
    }

    public static void main(String[] args){
        UserService userService = new UserServiceImpl();
        userService.getUserCount();
        UserService.say();
    }
}
