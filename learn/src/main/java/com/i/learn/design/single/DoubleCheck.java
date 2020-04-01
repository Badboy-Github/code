package com.i.learn.design.single;

// 双检锁模式
public class DoubleCheck {

    private static DoubleCheck instance;

    public static DoubleCheck getInstance(){
        // 第一次检查保证性能
        if(instance == null){
            // 第二次检查保证线程安全
            synchronized (DoubleCheck.class){
                if(instance == null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
