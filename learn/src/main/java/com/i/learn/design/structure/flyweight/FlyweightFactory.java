package com.i.learn.design.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class FlyweightFactory {

    private Map<String,Flyweight> flyweightMap = new HashMap<>();

    public Flyweight getFlyweight(String key){
        Flyweight flyweight = flyweightMap.get(key);
        if(flyweight != null){
            System.out.println("具体享元"+key+"已经存在，并被成功调用。");
        }else {
            flyweight = new ConcreteFlyweight(key);
            flyweightMap.put(key,flyweight);
        }
        return flyweight;
    }

}
