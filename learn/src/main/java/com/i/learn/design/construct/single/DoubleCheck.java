package com.i.learn.design.construct.single;

// 双检锁模式
public class DoubleCheck {

    private static volatile DoubleCheck instance;

    // private修饰构造方法避免类被外部实例化
    private DoubleCheck(){

    }

    public static DoubleCheck getInstance(){
        // 第一次检查保证性能
        if(instance == null){
            // 第二次检查保证线程安全
            synchronized (DoubleCheck.class){
                if(instance == null){
                    // volatile禁止进行指令重排序
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
