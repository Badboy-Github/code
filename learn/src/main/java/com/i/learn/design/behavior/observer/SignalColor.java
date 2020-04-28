package com.i.learn.design.behavior.observer;

// 信号灯事件
public class SignalColor extends Event{

    private String color;

    public SignalColor(Object source, String color){
        super(source);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
