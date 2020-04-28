package com.i.learn.design.behavior.observer;

public class Car implements Vehicle {

    @Override
    public void see(SignalColor signalColor) {
        if("红色".equals(signalColor.getColor())){
            System.out.println("红灯亮，轿车停。");
        }else if("绿色".equals(signalColor.getColor())){
            System.out.println("绿灯亮，轿车行。");
        }
    }

}
