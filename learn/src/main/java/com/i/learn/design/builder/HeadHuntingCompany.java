package com.i.learn.design.builder;

/**
 * 具体建造者
 */
public class HeadHuntingCompany extends CompanyCounselor {

    @Override
    void inviteCEO() {
        company.setCeo(new CEO());
    }

    @Override
    void inviteCTO() {
        company.setCto(new CTO());
    }

    @Override
    void inviteCOO() {
        company.setCoo(new COO());
    }

    @Override
    void inviteCFO() {
        company.setCfo(new CFO());
    }
}
