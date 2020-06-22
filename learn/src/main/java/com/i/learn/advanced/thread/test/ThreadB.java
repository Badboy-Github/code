package com.i.learn.advanced.thread.test;

public class ThreadB extends Thread {

    private Service service;

    private MyObject object;

    public ThreadB(Service service, MyObject object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.sayHelllo(object);
    }

}
