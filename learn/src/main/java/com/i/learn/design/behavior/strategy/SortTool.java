package com.i.learn.design.behavior.strategy;

/**
 * 环境类
 * 排序工具
 */
public class SortTool<T extends Comparable> {

    private ArraySort arraySort;

    public ArraySort getArraySort() {
        return arraySort;
    }

    public void setArraySort(ArraySort arraySort) {
        this.arraySort = arraySort;
    }

    public Comparable[] sort(T[] t){
        return arraySort.sort(t);
    }
}
