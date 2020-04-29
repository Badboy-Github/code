package com.i.learn.design.behavior.template;

public class TemplateDemo {

    public static void main(String[] args){
        // 根据状态去调节行为
        Human human = new Thanos(true);
        human.life();
    }
}
