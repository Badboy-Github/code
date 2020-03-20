package com.thanos.learn.thread;

public class DeamonThread extends Thread {

    @Override
    public void run() {
        System.out.println("I am DeamonThread");
    }

}
