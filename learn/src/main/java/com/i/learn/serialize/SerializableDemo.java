package com.i.learn.serialize;

import java.io.*;

public class SerializableDemo {

    public static void main(String[] args){
        // 创建对象
        Person person = new Person("I","1992-12-22");
        // 创建文件
        File file = new File("local/person1.txt");
        // 对象输出流
        ObjectOutputStream outputStream = null;
        try{
            outputStream = new ObjectOutputStream(new FileOutputStream(file));
            outputStream.writeObject(person);
            outputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("序列化结束");
        // 从文件读
        ObjectInputStream inputStream = null;
        Person p = new Person();
        try{
            inputStream = new ObjectInputStream(new FileInputStream(file));
            p = (Person) inputStream.readObject();
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("反序列化结束");
    }

}
