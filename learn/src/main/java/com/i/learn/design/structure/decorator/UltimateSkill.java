package com.i.learn.design.structure.decorator;

/**
 * 抽象装饰角色：大招
 */
public class UltimateSkill implements Armour {

    Armour armour;

    public UltimateSkill(Armour armour){
        this.armour = armour;
    }

    @Override
    public void display() {
        armour.display();
    }

}
