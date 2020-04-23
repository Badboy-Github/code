package com.i.learn.advanced.lock;


import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁演示
 * 读和读不互斥，读写、写读、写写互斥
 * @author Thanos
 * @since 2020/4/23
 */
public class ReadWriteLockDemo {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(Thread thread){
        // 加读锁
        lock.readLock().lock();
        try{
            System.out.println(thread.getName()+"正在读");
            Thread.sleep(1000);
            System.out.println(thread.getName()+"已读完");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 释放读锁
            lock.readLock().unlock();
        }
    }

    public void write(Thread thread){
        // 加写锁
        lock.writeLock().lock();
        try{
            System.out.println(thread.getName()+"正在写");
            Thread.sleep(1000);
            System.out.println(thread.getName()+"已写完");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 释放写锁
            lock.writeLock().unlock();
        }
    }

    public static void main(String[] args){
        final ReadWriteLockDemo demo = new ReadWriteLockDemo();
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
