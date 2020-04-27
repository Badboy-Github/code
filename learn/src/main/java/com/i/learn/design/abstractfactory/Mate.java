package com.i.learn.design.abstractfactory;

public class Mate implements Phone {

    @Override
    public void getOperatingSystem() {
        System.out.println("I am Mate, my system is Android.");
    }

}
