package com.i.learn.design.structure.bridge;

/**
 * 抽象化角色
 */
abstract class Bag {

    protected Color color;

    public void setColor(Color color){
        this.color = color;
    }

    abstract String getName();

}
