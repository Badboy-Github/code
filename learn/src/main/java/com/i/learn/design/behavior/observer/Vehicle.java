package com.i.learn.design.behavior.observer;

// 事件监听器
public interface Vehicle extends EventListener{

    // 事件处理方法
    void see(SignalColor signalColor);

}
