package com.i.learn.advanced.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo<T> {

    private T t;

    public GenericDemo(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args){
        GenericDemo genericDemo = new GenericDemo(10);
        System.out.println(genericDemo.getT());
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("world");
        getData(list1);
        getData1(list1);
        List<Integer> list2 = new ArrayList<>();
        getData2(list2);
    }

    // 泛型方法
    private static <T> void getData(List<T> list){
        for(T t : list){
            System.out.println(t);
        }
    }

    // 泛型通配符
    private static void getData1(List<?> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    // 有限的泛型通配符
    private static void getData2(List<? extends Number> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
