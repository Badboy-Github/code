package com.i.learn.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public static void main(String[] args){
        // 通过XmlBeanFactory创建对象
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource("xml/Beans.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        obj.getMessage();

        HelloWorld helloWorld = null;
        // 通过FileSystemXmlApplicationContext创建对象
        // 获得当前类的类路径
        String classPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(classPath+"xml/Beans.xml");
        helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
        // 通过ClassPathXmlApplicationContext创建对象
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("xml/Beans.xml");
        helloWorld = (HelloWorld)classPathXmlApplicationContext.getBean("helloWorld");
        helloWorld.getMessage();
    }
}
