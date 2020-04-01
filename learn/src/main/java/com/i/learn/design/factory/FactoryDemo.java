package com.i.learn.design.factory;

public class FactoryDemo {

    public static void main(String[] args){
        // 可通过xml配置具体创建类型
        BicycleFactory bicycleFactory = new AimaFactory();
        AimaBicycle aimaBicycle = (AimaBicycle)bicycleFactory.produce();
        aimaBicycle.show();
    }

}
