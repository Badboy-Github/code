package com.i.learn.design.observer;

public class ObserverDemo {

    public static void main(String[] args){
        // 新增观察者
        Car car = new Car();
        Bus bus = new Bus();
        // 新增事件源
        SignalLight signalLight = new SignalLight();
        // 添加事件观察者
        signalLight.addVehicleListener(car);
        signalLight.addVehicleListener(bus);
        // 触发事件
        signalLight.changeColor("红色");
        signalLight.changeColor("绿色");
    }

}
