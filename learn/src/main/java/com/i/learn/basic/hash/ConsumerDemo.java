package com.i.learn.basic.hash;

import java.io.*;
import java.util.*;

public class ConsumerDemo {
    public static void main(String[] args){
        // 获取文件
        File file = new File("H:\\code\\learn\\local\\consumer.text");
        InputStream inputStream = null;
        try{
            // 从文件获取输入流
            inputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            Consumer consumer = null;
            String str = null;
            String[] strList = null;
            // 统计每个用户每天消费情况
            Map<Consumer, List<Integer>> statistics = new HashMap<>();
            while ((str = reader.readLine()) != null){
                consumer = new Consumer();
                System.out.println(str);
                strList = str.split("\\t");
                consumer.setAccount(strList[0]);
                consumer.setCreateTime(strList[3].substring(0,10));
                // 判断Key是否重复
                if(statistics.containsKey(consumer)){
                    // 已有用户添加数据
                    List<Integer> list = statistics.get(consumer);
                    list.add(Integer.valueOf(strList[1]));
                    statistics.put(consumer,list);
                }else {
                    // 新增用户统计
                    List<Integer> list = new ArrayList<>();
                    list.add(Integer.valueOf(strList[1]));
                    statistics.put(consumer,list);
                }
            }
            // 打印数据
            for (Iterator<Consumer> i = statistics.keySet().iterator() ; i.hasNext(); ){
                Consumer c = i.next();
                System.out.println(c);
                System.out.println("key="+c+",value="+statistics.get(c));
            }
            // 关闭流
            reader.close();
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
