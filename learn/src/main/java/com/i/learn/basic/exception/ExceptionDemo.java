package com.i.learn.basic.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionDemo {

    public static void main(String[] args){
        try{
            int[] idList = new int[10];
            for (int i = 0; i < 11; i++){
                idList[i] = i;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            System.out.println(sw.toString());
        }

        // 自定义异常
        try{
            throw new CardNoException("位数不对");
        }catch (CardNoException e){
            System.out.println(e.getMsg());
            e.printStackTrace();
        }

    }

}
