package com.i.learn.design.single;

// 懒汉模式
public class LHan {

    // 声明静态变量
    private static LHan instance;

    // 获取对象,synchronized关键字保证线程安全，否则不安全
    public static synchronized LHan getInstance(){
        if(instance == null){
            instance = new LHan();
        }
        return instance;
    }

}
