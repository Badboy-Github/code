package com.i.learn.basic.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args){
        // 搜索范围
        String content = "hello world";
        // 搜索内容
        String pattern = ".*l(?:l|d)+.*";
        boolean result = Pattern.matches(pattern,content);
        System.out.println(result);

        matcher();
        System.out.println(matchPhoneNum("13888888888"));

    }

    private static void matcher() {
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }

    private static boolean matchPhoneNum(String phoneNum){
        String pattern = "1\\d{10}";
        return Pattern.matches(pattern,phoneNum);
    }

}
