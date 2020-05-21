package com.i.learn.advanced.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaList {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,5,1,2,3,4);
        list.forEach((Object t) -> print(t));
        list.removeIf(id -> id == 1);
        list.forEach(System.out::println);
        // 排序,o1-o2升序，o2-o1降序
        list.sort((o1, o2) -> o1-o2);
        list.forEach(System.out::println);
    }

    public static void print(Object t){
        System.out.println(t);
    }
}
