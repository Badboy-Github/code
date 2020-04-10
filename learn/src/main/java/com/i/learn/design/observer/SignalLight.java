package com.i.learn.design.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 事件源
public class SignalLight {

    // 监听器容器
    private List<Vehicle> listener;

    public SignalLight(){
        listener = new ArrayList<>();
    }

    // 新增事件监听器
    public void addVehicleListener(Vehicle vehicle){
        listener.add(vehicle);
    }

    // 事件触发器，信号灯改变颜色
    public void changeColor(String color){
        System.out.println(color+"信号灯亮");
        SignalColor event = new SignalColor(this, color);
        // 通知事件观察者
        notifies(event);
    }

    private void notifies(SignalColor e){
        Vehicle vehicle = null;
        Iterator<Vehicle> iterator = listener.iterator();
        while (iterator.hasNext()){
            vehicle = iterator.next();
            vehicle.see(e);
        }
        for(Vehicle vehicle1 : listener){
            vehicle1.see(e);
        }
    }
}
