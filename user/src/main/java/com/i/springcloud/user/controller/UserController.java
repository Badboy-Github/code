package com.i.springcloud.user.controller;

import com.i.springcloud.user.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    private UserService userService;

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("getUserById")
    public Object getUserById(Integer id){
        logger.info("info");
        logger.error("error ss");
        return userService.getUserById(id);
    }
}
