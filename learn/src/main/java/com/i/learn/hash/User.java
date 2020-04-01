package com.i.learn.hash;

public class User {

    private Integer id;

    private String name;

    private Integer age;

    // 有其他构造函数时必须写默认构造函数，否则不能使用
    public User(){

    }

    // 重载，相同方法，不同参数
    public User(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
}
