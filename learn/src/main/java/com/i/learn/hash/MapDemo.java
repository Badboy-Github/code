package com.i.learn.hash;

import java.util.*;

public class MapDemo {

    public static void main(String[] args){

        // 线程不安全
        Map<String,Object> map = new HashMap<>();
        // HashMap转换为线程安全
        Map<String,Object> safeMap = Collections.synchronizedMap(new HashMap<>());
        // 使用线程安全的HashTable
        Hashtable hashtable = new Hashtable();
        hashtable.put("key",123);
        Iterator i = hashtable.keySet().iterator();
        while (i.hasNext()){
            i.next();
        }
    }

}
