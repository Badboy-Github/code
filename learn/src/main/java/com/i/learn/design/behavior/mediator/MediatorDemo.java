package com.i.learn.design.behavior.mediator;

public class MediatorDemo {
    public static void main(String[] args){
        Colleage colleageA = new ConcreteColleageA();
        Colleage colleageB = new ConcreteColleageB();
        // 创建中介
        Mediator mediator = new ConcreteMediator();
        // 向中介注册自己
        mediator.register(colleageA);
        mediator.register(colleageB);
        colleageA.send(colleageB);
        colleageB.send(colleageA);
    }
}
