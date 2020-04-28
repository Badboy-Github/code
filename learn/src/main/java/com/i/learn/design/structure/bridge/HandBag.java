package com.i.learn.design.structure.bridge;

/**
 * 扩展抽象化角色
 */
public class HandBag extends Bag {

    @Override
    String getName() {
        return color.getColor()+"HandBag";
    }

}
