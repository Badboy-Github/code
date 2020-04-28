package com.i.learn.design.structure.adapter;

public class AdapteeImpl implements Adaptee {

    @Override
    public void specificRequest() {
        System.out.println("I am specific request.");
    }

}
