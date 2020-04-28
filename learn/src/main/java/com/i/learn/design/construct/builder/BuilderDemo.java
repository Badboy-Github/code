package com.i.learn.design.construct.builder;

public class BuilderDemo {

    public static void main(String[] args){
        // 创建建造者
        CompanyCounselor counselor = new HeadHuntingCompany();
        Boss boss = new Boss(counselor);
        Company company = boss.constructCompany();
    }
}
