package com.i.learn.design.single;

// 静态内部类
public class Singleton {

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
