package com.i.learn.design.behavior.iterator;

import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args){
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("华中科技大学");
        aggregate.add("武汉大学");
        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        int i = 1;
        System.out.println(++i);
        System.out.println(i++);
    }

}
