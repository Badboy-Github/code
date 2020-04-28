package com.i.learn.design.structure.decorator;

/**
 * 具体构建角色：铠
 */
public class OriginalArmour implements Armour {

    @Override
    public void display() {
        System.out.println("I am armour.");
    }

}
