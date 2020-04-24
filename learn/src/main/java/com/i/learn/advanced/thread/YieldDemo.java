package com.i.learn.advanced.thread;

/**
 * yield方法演示
 * yield方法使当前线程让出CPU执行权，使线程从Running回到Runnable
 */
public class YieldDemo implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            Thread.yield();
        }
    }

    public static void main(String[] args){
        YieldDemo yieldDemo = new YieldDemo();
        Thread firstThread = new Thread(yieldDemo,"FirstThread");
        Thread secondThread = new Thread(yieldDemo,"SecondThread");
        firstThread.start();
        secondThread.start();
    }
}
