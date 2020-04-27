package com.i.learn.design.abstractfactory;

public class HuaWeiCompany implements ScienceTechnologyCompany {

    @Override
    public Computer produceComputer() {
        return new MateBook();
    }

    @Override
    public Phone producePhone() {
        return new Mate();
    }
}
