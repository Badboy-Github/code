package com.i.learn.design.behavior.state;

/**
 * 状态具体实现
 */
public class ConcreteState extends State {

    @Override
    public void handle(Context context) {
        System.out.println("当前是具体状态1");
    }

}
