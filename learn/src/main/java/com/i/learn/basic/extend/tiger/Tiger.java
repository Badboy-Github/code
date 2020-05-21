package com.i.learn.basic.extend.tiger;

import com.i.learn.basic.extend.felidae.Felidae;

/**
 * 不同包下，子类可以访问从父类继承的protected方法，但不能访问基类实例的protected方法。
 */
public class Tiger extends Felidae {

    @Override
    protected void climbTree() {
        System.out.println("Tiger can climb tree.");
    }

    public static void main(String[] args){
        Tiger tiger = new Tiger();
        // 子类可以访问从父类继承的protected方法
        tiger.climbTree();
        Felidae felidae = new Tiger();
        // 不能访问基类实例的protected方法。
//        felidae.climbTree();
    }

}
