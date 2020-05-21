package com.i.learn.basic.c;

public class OutClass {

    private String name;

    private final Integer age = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class InnerClass{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args){
        OutClass out = new OutClass();
        out.setName("Out");
        InnerClass inner = out.new InnerClass();
        System.out.println(out.getName()+":"+inner.getName());
        // 局部内部类
        class MyThread extends Thread{
            @Override
            public void run() {
                System.out.println("局部内部类");
            }
        }
        MyThread myThread = new MyThread();
        myThread.start();
        // 匿名内部类
        new Thread(() -> System.out.println("匿名内部类")).start();
        // lambda表达式
        Thread t = new Thread(() -> {
            for(int i = 0; i < 10; i++){
                System.out.println(i);
            }
        });
        t.start();
        new Thread(() -> {
            System.out.println("lambda表达式");
        }).start();
    }
}
