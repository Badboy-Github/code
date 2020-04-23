package com.i.learn.basic.extend.tiger;

import com.i.learn.basic.extend.felidae.Felidae;

/**
 * 不同包下，子类可以访问从父类继承的protected方法，但不能访问基类实例的protected方法。
 */
public class Tiger extends Felidae {

    public static void main(String[] args){
        Tiger tiger = new Tiger();
        // 子类可以访问从父类继承的protected方法
        tiger.climbTree();
        Felidae felidae = new Tiger();
        // 不能访问基类实例的protected方法。
//        felidae.climbTree();
    }

}
