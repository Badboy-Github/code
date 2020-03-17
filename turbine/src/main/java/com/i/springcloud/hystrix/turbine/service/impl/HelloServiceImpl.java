package com.i.springcloud.hystrix.turbine.service.impl;

import com.i.springcloud.hystrix.turbine.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hi(String name) {
        return "fusing";
    }

}
