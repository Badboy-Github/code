package com.i.learn.design.behavior.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 迭代器具体实现
 */
public class ConcreteIterator implements Iterator {


    private List<Object> list = null;

    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(index < (list.size() - 1)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            return list.get(++index);
        }else {
            return null;
        }
    }
}
