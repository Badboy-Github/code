package com.i.learn.design.construct.abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args){
        // 抽象工厂
        ScienceTechnologyCompany company = new HuaWeiCompany();
        // 生产MateBook
        MateBook mateBook = (MateBook) company.produceComputer();
        mateBook.getOperatingSystem();
        // 生产Mate
        Mate mate = (Mate)company.producePhone();
        mate.getOperatingSystem();
        // 抽象工厂
        ScienceTechnologyCompany appleCompany = new AppleCompany();
        // 生产mac
        Mac mac = (Mac)appleCompany.produceComputer();
        mac.getOperatingSystem();
        // 生产Iphone
        IPhone iPhone = (IPhone) appleCompany.producePhone();
        iPhone.getOperatingSystem();

    }

}
