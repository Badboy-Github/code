package com.i.learn.design.construct.single;

// 饿汉模式
public class EHan {

    private static EHan instance = new EHan();

    // private修饰构造方法避免类被外部实例化
    private EHan(){

    }

    public static EHan getInstance(){
        return instance;
    }
}
