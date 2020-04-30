package com.i.learn.design.behavior.command;

public class CommandDemo {

    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.cell();
    }

}
