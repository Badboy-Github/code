package com.i.learn.design.structure.adapter;

public class AdapterDemo {

    public static void main(String[] args){
        // 类构造模式实现适配器
        Target target = new ClassAdater();
        target.request();
        // 对象模式实现适配器
        Adaptee adaptee = new AdapteeImpl();
        Target target1 = new ObjectAdapter(adaptee);
        target1.request();
    }
}
