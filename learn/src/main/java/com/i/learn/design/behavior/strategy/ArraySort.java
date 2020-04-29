package com.i.learn.design.behavior.strategy;

/**
 * 抽象策略
 * 数组排序
 */
public interface ArraySort<T extends Comparable<T>> {

    T[] sort(T[] t);

}
