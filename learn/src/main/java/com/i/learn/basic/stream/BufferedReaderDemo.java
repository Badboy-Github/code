package com.i.learn.basic.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        // 获得系统输入流
        InputStream inputStream = System.in;
        // 构造Reader输入流
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        // 构造Buffered输入流
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        // 读取字符
        String c;
        do{
            c = bufferedReader.readLine();
            System.out.println(c);
        }while (!c.equals("end"));
    }

}
