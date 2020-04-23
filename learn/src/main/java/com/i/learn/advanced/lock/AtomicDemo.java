package com.i.learn.advanced.lock;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 通过atomic包下的类实现原子操作
 */
public class AtomicDemo {

    private AtomicInteger atomicInteger = new AtomicInteger();

    public void add(){
        atomicInteger.getAndIncrement();
    }

    public static void main(String[] args){
        AtomicDemo demo = new AtomicDemo();
        for(int i = 0; i < 10; i++){
            // 继承Thread
            new Thread(){
                @Override
                public void run() {
                    for(int j = 0; j < 1000; j++){
                        demo.add();
                    }
                }
            }.start();
        }
        while (Thread.activeCount() > 1)Thread.yield();
        System.out.println(demo.atomicInteger);
    }
}
