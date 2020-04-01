package com.i.learn.design;

public class Person extends Animal {

    private String friend;

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    @Override
    public void speak() {
        System.out.println("I am person, i can speak human language");
    }

    public static void main(String[] args){
        // 多态，同一行为的不同表现形式
        // 多态条件，继承 重写 父类引用子类对象
        Animal animal = new Person();
        animal.speak();
    }
}
