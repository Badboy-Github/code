package com.i.learn.basic.gc;

public class FinalizeDemo {

    public static void main(String[] args){
        Cake cake1 = new Cake(1);
        Cake cake2 = new Cake(2);
        Cake cake3 = new Cake(3);
        cake2 = null;
        cake3 = null;
        // 手动触发GC
        System.gc();
    }

}
