package com.i.learn.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class AopConfig {

    @Bean
    public Student student(){
        return new Student();
    }

    @Bean
    public Logging logging(){
        return new Logging();
    }
}
