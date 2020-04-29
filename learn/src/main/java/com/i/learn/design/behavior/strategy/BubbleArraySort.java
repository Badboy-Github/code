package com.i.learn.design.behavior.strategy;

/**
 * 冒泡排序
 * @param <T>
 */
public class BubbleArraySort implements ArraySort {

    @Override
    public Comparable[] sort(Comparable[] t) {
        int size = t.length;
        Comparable max = null;
        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - 1 - i; j++){
                if(t[j].compareTo(t[j+1]) > 0){
                    max = t[j];
                    t[j] = t[j+1];
                    t[j+1] = max;
                }
            }
        }
        return t;
    }
}
