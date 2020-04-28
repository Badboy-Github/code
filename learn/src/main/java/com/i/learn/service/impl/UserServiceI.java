package com.i.learn.service.impl;

import com.i.learn.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService1")
public class UserServiceI implements UserService {

    @Override
    public Integer getUserCount() {
        return 2;
    }
}
