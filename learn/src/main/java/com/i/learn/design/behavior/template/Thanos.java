package com.i.learn.design.behavior.template;

public class Thanos extends Human {

    private boolean status;

    public Thanos(boolean status) {
        this.status = status;
    }

    @Override
    public void hookMethod1() {
        System.out.println("思考或提前睡觉");
    }

    @Override
    public boolean hookMethod2() {
        return status;
    }

    @Override
    void work() {
        System.out.println("Thanos需要学习Java 读书 练字 健身");
    }
}
