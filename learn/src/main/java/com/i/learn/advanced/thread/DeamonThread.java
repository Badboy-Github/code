package com.i.learn.advanced.thread;

public class DeamonThread extends Thread {

    @Override
    public void run() {
        System.out.println("I am DeamonThread");
    }

}
