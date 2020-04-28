package com.i.learn.controller;

import com.i.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HelloController {

    @Autowired
    @Qualifier("userService1")
    private UserService userService;

    @Resource(name = "userServiceImpl")
    private UserService userService1;

    @GetMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response,Integer data) throws IOException {
        return "hello";
    }

    @GetMapping("/getUserCount")
    public void getUserCount(){
        System.out.println(userService.getUserCount());
        System.out.println(userService1.getUserCount());
    }
}
