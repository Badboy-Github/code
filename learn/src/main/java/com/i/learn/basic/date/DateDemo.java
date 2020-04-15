package com.i.learn.basic.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) throws InterruptedException{
        Date currentTime = new Date();
        Thread.sleep(1000);
        Date time = new Date(System.currentTimeMillis());
        if(time.compareTo(currentTime) > 0){
            System.out.println("后一个时间大于前一个时间");
        }
        // H-24小时制 h-12小时制
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(currentTime));

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTimeZone());

        // 初始化 Date 对象
        Date date = new Date();

        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n",date);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n",date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n",date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR",date);
    }

}
