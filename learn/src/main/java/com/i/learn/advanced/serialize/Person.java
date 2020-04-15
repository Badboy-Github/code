package com.i.learn.advanced.serialize;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 2L;

    private String name;

    private String birthDay;

    private Integer age;

    public Person(){}

    public Person(String name, String birthDay){
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
