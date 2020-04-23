package com.i.learn.advanced.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    public Integer id = 0;

    private ReentrantLock lock = new ReentrantLock();

    public void read(Thread thread){
        // 加读锁
        lock.lock();
        try{
            System.out.println(thread.getName()+"正在读");
            Thread.sleep(1000);
            System.out.println(thread.getName()+"已读完");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 释放读锁
            lock.unlock();
        }
    }

    private void write(Thread thread){
        // 加写锁
        lock.lock();
        try{
            System.out.println(thread.getName()+"正在写");
            Thread.sleep(1000);
            System.out.println(thread.getName()+"已写完");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 释放写锁
            lock.unlock();
        }
    }

    public static void main(String[] args){
        final LockDemo demo = new LockDemo();
        new Thread(){
            @Override
            public void run() {
                demo.read(this);
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                demo.write(this);
            }
        }.start();
    }
}
