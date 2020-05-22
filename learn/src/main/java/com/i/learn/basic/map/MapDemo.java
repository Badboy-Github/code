package com.i.learn.basic.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {

    public static void main(String[] args){

        // 线程不安全
        Map<String,Object> map = new HashMap<>();
        // HashMap转换为线程安全
        Map<String,Object> safeMap = Collections.synchronizedMap(new HashMap<>());
        // 使用线程安全的HashTable,锁整个表，性能低
        Hashtable hashtable = new Hashtable();
        hashtable.put("key",123);
        Iterator i = hashtable.keySet().iterator();
        while (i.hasNext()){
            i.next();
        }
        // 使用ConcurrentHashMap
        Map<String,Integer> result = new ConcurrentHashMap<>();
        result.put("key1",2);
        result.put("key2",2);
        result.get("key1");
        Comparator<Map.Entry<String,Integer>> c = Map.Entry.comparingByKey();
        int j = c.compare(result.entrySet().iterator().next(),result.entrySet().iterator().next());
        int k = 0;
        // null验证
        Map<String,Object> t = new Hashtable<>();
        map.put(null,3);
        map.put("key",null);
        System.out.println("HashMap的key可为null"+map.get(null));
        System.out.println("HashMap的value可为null"+map.get("key"));
        // 验证Hashtable的key
        t.put("key","value");
        try{
            t.put(null,3);
        }catch (Exception e){
            System.out.println("Hashtable的key不能为空");
        }
        // 验证Hashtable的value
        try{
            t.put("3",null);
        }catch (Exception e){
            System.out.println("Hashtable的value不能为空");
        }
    }

}
