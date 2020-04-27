package com.i.learn.design.abstractfactory;

public class AppleCompany implements ScienceTechnologyCompany {

    @Override
    public Computer produceComputer() {
        return new Mac();
    }

    @Override
    public Phone producePhone() {
        return new IPhone();
    }
}
