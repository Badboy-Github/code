package com.i.learn.design.abstractfactory;

public class Mac implements Computer {

    @Override
    public void getOperatingSystem() {
        System.out.println("I am Mac, my system is mac.");
    }
}
