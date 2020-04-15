package com.i.learn.basic.gc;

public class Cake extends Object {

    public Cake(){

    }

    public Cake(Integer id){
        this.id = id;
        System.out.println("Cake "+id+" is created");
    }

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println("Cake "+id+" is disposed");
    }
}
