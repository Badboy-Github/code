package com.i.learn.design.observer;

public class Bus implements Vehicle {

    @Override
    public void see(SignalColor signalColor) {
        if("红色".equals(signalColor.getColor())){
            System.out.println("红灯亮，公共汽车停。");
        }else if("绿色".equals(signalColor.getColor())){
            System.out.println("绿灯亮，公共汽车行。");
        }
    }

}
