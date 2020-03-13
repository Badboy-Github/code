package com.i.springcloud.feign.service.impl;

import com.i.springcloud.feign.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hi(String name) {
        return "fusing";
    }

}
