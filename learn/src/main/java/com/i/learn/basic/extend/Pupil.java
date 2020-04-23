package com.i.learn.basic.extend;

/**
 * 实现抽象类
 */
public class Pupil extends Student {

    @Override
    public void work() {
        System.out.println("do homework");
    }

    public static void main(String[] args){
        Student student = new Pupil();
        student.work();
        student.speak();
    }

}
