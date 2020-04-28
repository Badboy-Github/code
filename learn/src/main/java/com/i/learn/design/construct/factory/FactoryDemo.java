package com.i.learn.design.construct.factory;

public class FactoryDemo {

    public static void main(String[] args){
        // 可通过xml配置具体创建类型
        BicycleFactory bicycleFactory = new AimaFactory();
        // 通过工厂的生产产品方法生成产品
        AimaBicycle aimaBicycle = (AimaBicycle)bicycleFactory.produce();
        aimaBicycle.show();
    }

}
