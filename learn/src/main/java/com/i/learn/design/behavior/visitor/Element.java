package com.i.learn.design.behavior.visitor;

/**
 * 抽象元素
 */
public interface Element {

    void accept(Visitor visitor);

}
