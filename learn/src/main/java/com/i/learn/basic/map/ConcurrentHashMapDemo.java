package com.i.learn.basic.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args){
        Map<String,Object> map = new ConcurrentHashMap<>();
        for(int i = 1; i <= 64; i++){
            if(i == 11){
                System.out.println("扩容");
            }
            map.put("key"+i,i);
        }
        System.out.println(map.get("key8"));
    }
}
