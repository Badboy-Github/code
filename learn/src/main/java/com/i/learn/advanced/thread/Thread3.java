package com.i.learn.advanced.thread;

import java.util.concurrent.Callable;

// V 泛型
public class Thread3<V> implements Callable<V> {

    @Override
    public V call() throws Exception {
        System.out.println("I am Tread3.");
        return (V) "ok";
    }

}
