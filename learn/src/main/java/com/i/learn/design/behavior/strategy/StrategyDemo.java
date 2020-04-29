package com.i.learn.design.behavior.strategy;

public class StrategyDemo {
    public static void main(String[] args){
        Integer[] a = {4,5,1,3};
        ArraySort arraySort = new InsertSort();
        SortTool sortTool = new SortTool();
        sortTool.setArraySort(arraySort);
        sortTool.sort(a);
        for(Integer i : a){
            System.out.println(i);
        }
    }
}
