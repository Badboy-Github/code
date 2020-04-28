package com.i.learn.design.structure.adapter;

/**
 * 类适配器
 */
public class ClassAdater extends  AdapteeImpl implements Target{

    @Override
    public void request() {
        // 通过继承父类的方法实现目标类的方法
        specificRequest();
    }

}
