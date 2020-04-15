package com.i.learn.advanced.thread;

import java.util.Date;
import java.util.TimerTask;

public class Task1 extends TimerTask {

    @Override
    public void run() {
        System.out.println("I am task1, my exec time is "+new Date());
        DeamonThread deamonThread = new DeamonThread();
        deamonThread.start();
    }

}
