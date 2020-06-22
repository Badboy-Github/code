package com.i.learn.design.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 具体聚合
 */
public class ConcreteAggregate implements Aggregate {

    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object o) {
        list.add(o);
    }

    @Override
    public void remove(Object o) {
        list.remove(o);
    }

    @Override
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
