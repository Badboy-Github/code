package com.i.learn.design.behavior.visitor;

/**
 * 具体元素B
 */
public class ConcreteElementB implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.create(this);
    }

    public String operationB(){
        return "元素B的操作";
    }
}
