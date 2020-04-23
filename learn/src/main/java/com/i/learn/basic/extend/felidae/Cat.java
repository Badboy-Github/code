package com.i.learn.basic.extend.felidae;

/**
 * 同一包下，子类可以访问从父类继承的protected方法
 */
public class Cat extends Felidae{

    public static void main(String[] args){
        Felidae felidae = new Cat();
        felidae.climbTree();
    }
}
