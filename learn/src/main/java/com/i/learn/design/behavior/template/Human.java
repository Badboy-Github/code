package com.i.learn.design.behavior.template;

/**
 * 人类模板
 */
public abstract class Human {

    void life(){
        sleep();
        eat();
        if(!hookMethod2()){
            hookMethod1();
        }else {
            work();
        }
    }

    void sleep(){
        System.out.println("人需要睡觉");
    }

    void eat(){
        System.out.println("人需要吃饭");
    }

    abstract void work();

    public void hookMethod1(){}  //钩子方法1

    public boolean hookMethod2() //钩子方法2
    {
        return false;
    }
}
