package com.i.learn.advanced.thread;

/** join方法演示
 * 将异步执行的线程合并为同步的线程
 */
public class JoinDemo {

    public void joinTest(){
        try{
            System.out.println("child thread begin.");
            Thread.sleep(3000);
            System.out.println("child thread finish.");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        System.out.println("Main thread begin.");
        JoinDemo joinDemo = new JoinDemo();
        Thread thread = new Thread(){
            @Override
            public void run() {
                joinDemo.joinTest();
            }
        };
        thread.start();
        // join作用是父线程等待子线程执行完成后再执行
        try{
            thread.join(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main thread finish.");
    }
}
