package com.i.learn.design.behavior.visitor;

/**
 * 具体元素A
 */
public class ConcreteElementA implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.create(this);
    }

    public String operationA(){
        return "元素A的操作";
    }
}
