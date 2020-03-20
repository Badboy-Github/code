package com.thanos.learn.thread;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class ThreadDemo {

    public static void main(String[] args){
        System.out.println("ThreadDemo begin");
        // 实现Runnable的Thread1
        Thread thread1 = new Thread(new Thread1());
        // 设置thread1为守护线程
        thread1.setDaemon(true);
        thread1.start();
        // 继承Tread的Thread2
        Thread2 thread2 = new Thread2();
        thread2.start();
        // 继承TimerTask的task1
        // 日历类
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,3);
        Date date = calendar.getTime();
        Task1 task1 = new Task1();
        // isDaemon设置为true则为守护线程
        Timer timer = new Timer();
        timer.schedule(task1,date);
        System.out.println("ThreadDemo end");
    }

}
