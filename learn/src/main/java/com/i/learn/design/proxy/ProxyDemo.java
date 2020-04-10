package com.i.learn.design.proxy;

public class ProxyDemo {

    public static void main(String[] args){
        HouseOwner houseOwner = new HouseProxy();
        houseOwner.display();
    }
}
