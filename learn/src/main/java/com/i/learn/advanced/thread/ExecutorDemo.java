package com.i.learn.advanced.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@SuppressWarnings("unchecked")
public class ExecutorDemo {

    public static void main(String[] args) throws ExecutionException,InterruptedException {
        int taskSize = 5;
        // 创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);
        // 创建多个有返回值的任务
        List<Future> list = new ArrayList<>();
        for (int i = 0; i < taskSize; i++){
            Callable c = new Thread3();
            // 执行并获取Future对象
            Future future = pool.submit(c);
            list.add(future);
        }
        // 关闭线程池
        pool.shutdown();
        // 获取线程执行结果
        for(Future future : list){
            System.out.println("线程执行结果："+future.get());
        }
    }

}
