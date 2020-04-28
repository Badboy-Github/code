package com.i.learn.design.construct.builder;

/**
 * 抽象建造者
 */
public abstract class CompanyCounselor {

    protected Company company = new Company();

    abstract void inviteCEO();

    abstract void inviteCTO();

    abstract void inviteCOO();

    abstract void inviteCFO();

    Company getCompany(){
        return company;
    }

}
