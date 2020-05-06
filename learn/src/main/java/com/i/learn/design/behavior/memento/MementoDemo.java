package com.i.learn.design.behavior.memento;

public class MementoDemo {

    public static void main(String[] args){
        // 管理者
        Caretaker caretaker = new Caretaker();
        // 发起者
        Originator originator = new Originator();
        originator.setState("S0");
        // 创建备忘录
        Memento memento = originator.createMemento();
        caretaker.setMemento(memento);
        System.out.println("发起者状态为"+originator.getState());
        originator.setState("S1");
        System.out.println("发起者状态为"+originator.getState());
        // 从备忘录恢复
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("发起者状态为"+originator.getState());
    }

}
