package com.i.learn.main;

public class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(this.getName());
        System.out.println(this.isAlive());
    }
}
