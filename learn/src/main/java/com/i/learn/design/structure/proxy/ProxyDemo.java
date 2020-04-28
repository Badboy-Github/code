package com.i.learn.design.structure.proxy;

public class ProxyDemo {

    public static void main(String[] args){
        HouseOwner houseOwner = new HouseProxy();
        houseOwner.display();
    }
}
