package com.i.learn.advanced.thread.test;

public class Service {

    public void sayHelllo(MyObject object){
        synchronized (object){
            System.out.println("begin time:"+System.currentTimeMillis()+",Thread Name:"+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("end time:"+System.currentTimeMillis()+",Thread Name:"+Thread.currentThread().getName());
        }
    }
}
