package com.i.learn.advanced.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int i = 1;
        int j = 1;
        return i+j;
    }

    public static void main(String[] args){
        FutureTask<Integer> futureTask = new FutureTask(new CallableDemo());
        Thread thread = new Thread(futureTask);
        thread.start();
        try{
            int i = futureTask.get();
            System.out.println(i);
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
    }

}
