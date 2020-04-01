package com.i.learn.design.factory;

public class AimaFactory implements BicycleFactory {

    @Override
    public Bicycle produce() {
        return new AimaBicycle();
    }

}
