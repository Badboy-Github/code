package com.i.learn.advanced.lock;

public class VolatileDemo {

    private Integer version = 0;

    private volatile boolean status = false;

    public Integer addVersion(){
        System.out.println(version);
        return version++;
    }

    public static void main(String[] args){
        VolatileDemo demo = new VolatileDemo();
        for(int i = 0; i < 10; i++){
            // 继承Thread
            new Thread(){
                @Override
                public void run() {
                    for(int j = 0; j < 1; j++){
                        demo.addVersion();
                    }
                }
            }.start();
        }
        while (Thread.activeCount() > 1)Thread.yield();
        System.out.println(demo.version);
    }

}
