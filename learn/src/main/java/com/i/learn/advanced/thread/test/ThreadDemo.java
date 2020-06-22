package com.i.learn.advanced.thread.test;

public class ThreadDemo {

    public static void main(String[] args){
        Service serviceA = new Service();
        Service serviceB = new Service();
        MyObject objectA = new MyObject();
        MyObject objectB = new MyObject();
        // 线程A
        ThreadA threadA = new ThreadA(serviceA,objectA);
        threadA.setName("A");
        threadA.start();
        // 线程B
        ThreadB threadB = new ThreadB(serviceB,objectA);
        threadB.setName("B");
        threadB.start();
    }

}
