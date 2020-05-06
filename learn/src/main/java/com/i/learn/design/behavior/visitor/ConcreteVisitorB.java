package com.i.learn.design.behavior.visitor;

/**
 * 具体访问者B
 */
public class ConcreteVisitorB implements Visitor {

    @Override
    public void create(ConcreteElementA concreteElementA) {
        System.out.println("具体访问者B访问"+concreteElementA.operationA());
    }

    @Override
    public void create(ConcreteElementB concreteElementB) {
        System.out.println("具体访问者B访问"+concreteElementB.operationB());
    }
}
