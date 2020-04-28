package com.i.learn.design.structure.decorator;

public class DecoratorDemo {
    public static void main(String[] args){
        // 原型抽象
        Armour armour = new OriginalArmour();
        armour.display();
        // 装饰抽象
        UltimateSkill ultimateSkill = new ArmourEmperor(armour);
        ultimateSkill.display();
    }
}
