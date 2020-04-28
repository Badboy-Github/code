package com.i.learn.design.construct.abstractfactory;

public class IPhone implements Phone {

    @Override
    public void getOperatingSystem() {
        System.out.println("I am Iphone, my system is Ios.");
    }
}
