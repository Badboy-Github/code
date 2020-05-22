package com.i.learn.advanced.thread;

public class VolatileDemo {

    // 可见的共享变量
    private Integer i;

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public static void main(String[] args) throws InterruptedException{
        VolatileDemo demo = new VolatileDemo();
        demo.setI(1);
        // 线程2
        new Thread(() -> {
            try{
                Thread.sleep(0);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            demo.setI(3);
        }).start();
        // 线程1
        new Thread(() -> {
            System.out.println(demo.getI());
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(demo.getI());
        }).start();

    }
}
