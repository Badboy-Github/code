package com.i.learn.design.behavior.memento;

/**
 * 备忘录
 */
public class Memento {

    public Memento(String state) {
        this.state = state;
    }

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
