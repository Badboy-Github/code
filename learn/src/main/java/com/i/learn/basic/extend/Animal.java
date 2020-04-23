package com.i.learn.basic.extend;

public class Animal {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void speak(){
        System.out.println("I am an animal, i can speak.");
    }

    protected void move(){
        System.out.println("I can move.");
    }
}
