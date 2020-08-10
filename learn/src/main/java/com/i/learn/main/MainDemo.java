package com.i.learn.main;


public class MainDemo {

    public static void main(String[] args) {
        String s = new String(new byte[10]);
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.setName("A");
        threadDemo.start();
    }

}
