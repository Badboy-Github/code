package com.i.learn.design.behavior.mediator;

public class ConcreteColleageA extends Colleage{

    @Override
    void receive() {
        System.out.println("同事A收到信息。");
    }

    @Override
    void send(Colleage colleage) {
        System.out.println("同事A发送信息。");
        mediator.relay(colleage);
    }
}
