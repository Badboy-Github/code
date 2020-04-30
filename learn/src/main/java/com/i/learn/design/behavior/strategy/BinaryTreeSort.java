package com.i.learn.design.behavior.strategy;

import java.util.List;

/**
 * 二叉树排序
 */
public class BinaryTreeSort<T extends Comparable> implements ArraySort {

    @Override
    public Comparable[] sort(Comparable[] t) {
        Node<T> node = new Node<>();
        for(Comparable value : t){
            node.insert((T)value);
        }
        List<Object> values = node.getValues(node.getRoot());
        for(int i = 0; i < values.size(); i ++){
            t[i] = (T)values.get(i);
        }
        return t;
    }
}
