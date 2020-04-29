package com.i.learn.design.structure.composite.lucency;

public class CompositeDemo {

    public static void main(String[] args){
        // 树枝节点
        Component c0 = new Composite();
        Component c1 = new Composite();
        // 树叶节点
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        // 树枝节点添加树叶节点
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        // 显示所有叶子节点
        c0.operation();
    }

}
