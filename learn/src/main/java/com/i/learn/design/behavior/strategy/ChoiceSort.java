package com.i.learn.design.behavior.strategy;

/**
 * 选择排序
 * 每次选择最小的放在位置i
 */
public class ChoiceSort implements ArraySort{

    @Override
    public Comparable[] sort(Comparable[] t) {
        Comparable max = null;
        for(int i = 0; i < t.length - 1; i++){
            for(int j = i + 1; j < t.length; j++){
                if(t[i].compareTo(t[j]) > 0){
                    max = t[i];
                    t[i] = t[j];
                    t[j] = max;
                }
            }
        }
        return t;
    }
}
