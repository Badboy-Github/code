package com.i.springcloud.ribbon.service.impl;

import com.i.springcloud.ribbon.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name) {
        return restTemplate.getForObject("http://client/hello/sayName?name="+name,String.class);
    }

    @Override
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
