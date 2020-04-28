package com.i.learn.design.structure.decorator;

/**
 * 具体装饰角色：凯皇
 */
public class ArmourEmperor extends UltimateSkill{


    public ArmourEmperor(Armour armour) {
        super(armour);
    }

    @Override
    public void display() {
        armour.display();
        addDefense();
    }

    public void addDefense(){
        System.out.println("I am ArmourEmperor.");
        System.out.println("增加防御");
    }

}
