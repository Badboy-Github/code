package com.i.learn.service;

public interface UserService {

    public static final String c = "c";

   public static void say(){
      System.out.println("I am static method."+c);
   }

   Integer getUserCount();

}
