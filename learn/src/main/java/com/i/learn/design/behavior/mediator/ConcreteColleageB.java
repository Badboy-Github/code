package com.i.learn.design.behavior.mediator;

public class ConcreteColleageB extends Colleage {
    @Override
    void receive() {
        System.out.println("同事B收到信息。");
    }

    @Override
    void send(Colleage colleage) {
        System.out.println("同事B发送信息。");
        mediator.relay(colleage);
    }
}
