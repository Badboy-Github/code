package com.i.springcloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 相当于@Controller+@ResponseBody
@RestController
// URL映射地址
@RequestMapping("/hello/*")
public class HelloController {

    @Value("${server.port}")
    String port;

    @GetMapping("sayName")
    public String sayName(String name) throws Exception{
        Thread.sleep(6000);
        return name+",I am port:"+port;
    }

}
