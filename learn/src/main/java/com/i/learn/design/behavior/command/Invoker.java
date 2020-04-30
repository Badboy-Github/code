package com.i.learn.design.behavior.command;

/**
 * 命令调用者
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void cell(){
        command.execute();
    }
}
