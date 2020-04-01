package com.i.learn.design.factory;

public class YadeaFactory implements BicycleFactory {

    @Override
    public Bicycle produce() {
        return new YadeaBicycle();
    }

}
