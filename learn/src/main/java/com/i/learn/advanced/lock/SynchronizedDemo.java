package com.i.learn.advanced.lock;

public class SynchronizedDemo {

    public static void main(String[] args){

        SynchronizedDemo demo = new SynchronizedDemo();
        // 线程1启动
        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
                synchronizedDemo.method1();
                synchronizedDemo.method3();
            }
        }).start();
        // 线程2启动
        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
                synchronizedDemo.method2();
                demo.method3();
            }
        }).start();
    }

    public void method1(){

        // 修饰代码块
        synchronized(this){
            System.out.println("method1 begin");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("hello,method1");
            System.out.println("method1 end");
        }


    }

    // 修饰方法
    public synchronized void method2(){
        System.out.println("method2 begin");
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("hello,method2");
        System.out.println("method2 end");
    }

    // 修饰静态方法，类作为锁对象
    public synchronized static void method3(){
        for(int i = 0; i < 5; i++){
            System.out.println("I am count:"+i);
        }
    }

}
