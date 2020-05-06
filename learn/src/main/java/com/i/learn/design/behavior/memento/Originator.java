package com.i.learn.design.behavior.memento;

/**
 * 发起人
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建备忘录
    public Memento createMemento(){
        return new Memento(state);
    }

    // 从备忘录恢复
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
