package com.i.learn.design.construct.single;

// 静态内部类
public class Singleton {

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    // private修饰构造方法避免类被外部实例化
    private Singleton(){

    }

    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
