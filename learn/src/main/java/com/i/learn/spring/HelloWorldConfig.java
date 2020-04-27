package com.i.learn.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public static void main(String[] args){
        // 是配置类被加载到spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(HelloWorldConfig.class);
        context.refresh();
        HelloWorldConfig config = (HelloWorldConfig)context.getBean(HelloWorldConfig.class);
        config.setMessage("Hello World");
        config.getMessage();
    }
}
