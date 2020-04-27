package com.i.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopDemo {

    public static void main(String[] args){
        method2();
    }

    public static void method1(){
        // 是配置类被加载到spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AopConfig.class);
        context.refresh();
        Student student = (Student) context.getBean(Student.class);
        student.getName();
        student.getAge();
        student.printThrowException();
    }

    public static void method2(){
        // 通过ClassPathXmlApplicationContext创建对象
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("xml/AopBeans.xml");
        Student student = (Student) classPathXmlApplicationContext.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }

}
