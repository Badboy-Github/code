package com.i.learn.design.behavior.visitor;

public class VisitorDemo {

    public static void main(String[] args){
        ObjectStructure structure = new ObjectStructure();
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();
        structure.add(elementA);
        structure.add(elementB);
        // 访问对象
        Visitor visitorA = new ConcreteVisitorA();
        structure.accept(visitorA);
    }

}
