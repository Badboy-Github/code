package com.i.learn.design.abstractfactory;

public class MateBook implements Computer {

    @Override
    public void getOperatingSystem() {
        System.out.println("I am MateBook, my system is Windows.");
    }

}
