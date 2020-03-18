package com.i.springcloud.user.service.impl;

import com.i.springcloud.user.entity.User;
import com.i.springcloud.user.mapper.UserMapper;
import com.i.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
