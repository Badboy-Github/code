package com.i.learn.design.structure.composite.lucency;

/**
 * 抽象构建角色
 */
public interface Component {

    void add(Component component);

    void remove(Component component);

    Component getChild(int i);

    void operation();

}
