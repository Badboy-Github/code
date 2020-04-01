package com.i.learn.design.single;

// 饿汉模式
public class EHan {

    private static EHan instance = new EHan();

    public static EHan getInstance(){
        return instance;
    }
}
