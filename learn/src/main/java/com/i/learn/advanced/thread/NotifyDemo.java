package com.i.learn.advanced.thread;

public class NotifyDemo {

    public synchronized void waitTest(Thread thread){
        try{
            // 调用Object方法使线程阻塞
            System.out.println(thread.getName()+"is blocked.");
            wait();
            System.out.println(thread.getName()+"is waited.");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        NotifyDemo notifyDemo = new NotifyDemo();
        try{
            for(int i = 0; i < 5; i++){
                new Thread(){
                    @Override
                    public void run() {
                        notifyDemo.waitTest(this);
                    }
                }.start();
            }
            // 休眠1s,确保线程创建完成
            Thread.sleep(1000);
            synchronized (notifyDemo){
                System.out.println("唤醒一个线程");
                notifyDemo.notify();
            }
            Thread.sleep(3000);
            synchronized (notifyDemo){
                System.out.println("唤醒所有线程");
                notifyDemo.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }

}
