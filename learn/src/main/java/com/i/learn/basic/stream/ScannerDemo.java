package com.i.learn.basic.stream;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args){
        // 从键盘接受数据
        Scanner scanner = new Scanner(System.in);
        //
        System.out.println("next方式接受数据：");
        while (scanner.hasNextFloat()){
            String str = String.valueOf(scanner.nextFloat());
            System.out.println("输入的数据为："+str);
        }
        // 关闭输入流
        scanner.close();
    }
}
