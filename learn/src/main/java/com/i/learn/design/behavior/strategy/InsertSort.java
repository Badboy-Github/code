package com.i.learn.design.behavior.strategy;

/**
 * 插入排序
 */
public class InsertSort implements ArraySort{

    @Override
    public Comparable[] sort(Comparable[] t) {
        Comparable temp = null;
        for(int i = 1; i < t.length; i++){
            for(int j = i; j > 0; j--){
                if(t[j].compareTo(t[j-1]) < 0){
                    temp = t[j];
                    t[j] = t[j-1];
                    t[j-1] = temp;
                }
            }
        }
        return t;
    }

}
