package com.i.learn.design.behavior.state;

public class StateDemo {

    public static void main(String[] args){
        // 新增状态无需修改原来的代码调用
        State state = new ConcreteState();
        Context context = new Context();
        context.setState(state);
        context.handle();
    }

}
