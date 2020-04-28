package com.i.learn.design.structure.bridge;

/**
 * 具体实现化角色
 */
public class Green implements Color {

    @Override
    public String getColor() {
        System.out.println("I am green.");
        return "green";
    }

}
