package com.i.learn.design.structure.bridge;


public class BridgeDemo {

    public static void main(String[] args){
        Color color = new Red();
        Bag bag = new HandBag();
        bag.setColor(color);
        System.out.println(bag.getName());
    }

}
