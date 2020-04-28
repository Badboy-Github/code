package com.i.learn.design.construct.builder;

/**
 * 指挥者
 */
public class Boss {

    private CompanyCounselor companyCounselor;

    public Boss(CompanyCounselor companyCounselor){
        this.companyCounselor = companyCounselor;
    }

    public Company constructCompany(){
        companyCounselor.inviteCEO();
        companyCounselor.inviteCFO();
        companyCounselor.inviteCOO();
        companyCounselor.inviteCTO();
        return companyCounselor.getCompany();
    }
}
