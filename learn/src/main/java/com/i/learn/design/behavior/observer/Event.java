package com.i.learn.design.behavior.observer;

// 事件
public class Event {

    public Event(Object object){
        this.object = object;
    }

    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
