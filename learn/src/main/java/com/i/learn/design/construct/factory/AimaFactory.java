package com.i.learn.design.construct.factory;

public class AimaFactory implements BicycleFactory {

    @Override
    public Bicycle produce() {
        return new AimaBicycle();
    }

}
