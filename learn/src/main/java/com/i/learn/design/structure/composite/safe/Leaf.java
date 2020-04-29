package com.i.learn.design.structure.composite.safe;

/**
 * 安全模式下的叶子
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("叶子"+name+"被访问！");
    }
}
