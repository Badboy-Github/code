package com.i.learn.design.behavior.chain;

public class ChainDemo {

    public static void main(String[] args){
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler1.handleRequest("2");
    }
}
