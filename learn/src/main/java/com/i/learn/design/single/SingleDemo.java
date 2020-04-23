package com.i.learn.design.single;

import com.i.learn.basic.extend.Person;

public class SingleDemo {

    public static void main(String[] args){
        // 懒汉模式
        LHan lHan = LHan.getInstance();
        // 饿汉模式
        EHan eHan = EHan.getInstance();
        // 双检锁模式
        DoubleCheck doubleCheck = DoubleCheck.getInstance();
        // 静态内部类
        Singleton singleton = Singleton.getInstance();
        // 枚举模式
        DBConnection dbConnection = SingleEnum.INSTANCE.getDBConnection();
        Person.main(null);
        System.out.println("Single case design pattern");
    }
}
