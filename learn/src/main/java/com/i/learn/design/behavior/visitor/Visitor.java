package com.i.learn.design.behavior.visitor;

/**
 * 抽象访问者
 */
public interface Visitor {

    void create(ConcreteElementA concreteElementA);

    void create(ConcreteElementB concreteElementB);

}
