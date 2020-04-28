package com.i.learn.design.structure.flyweight;

public class FlyweightDemo {

    public static void main(String[] args){
        // 创建工厂
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("key1");
        Flyweight flyweight2 = factory.getFlyweight("key2");
        Flyweight flyweight3 = factory.getFlyweight("key1");
        flyweight1.operation(new UnsharedConcreteFlyweight("第一次白色五子棋"));
        flyweight2.operation(new UnsharedConcreteFlyweight("第二次黑色五子棋"));
        flyweight3.operation(new UnsharedConcreteFlyweight("第三次黑色五子棋"));
    }

}
