package com.i.learn.advanced.lambda;

public class LambdaThread {

    public static void main(String[] args){
        Thread t = new Thread(() -> {
            for(int i = 0; i < 10; i++){
                System.out.println(i);
            }
        });
        t.start();
    }
}
