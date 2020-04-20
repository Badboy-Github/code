package com.i.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response,Integer data) throws IOException {
//        response.sendError(400,"错误测试");
        return null;
    }
}
