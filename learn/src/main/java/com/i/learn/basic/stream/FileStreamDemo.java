package com.i.learn.basic.stream;

import java.io.*;

public class FileStreamDemo {

    public static void main(String[] args) throws IOException {
        // 创建文件对象
        File file = new File("D:/hello.txt");
        writerDemo(file);
//        inputStream(file);
    }

    private static void inputStream(File file) throws IOException{
        // 获取输出流
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write("hello world 我爱中国".getBytes());
        // 关闭流
        outputStream.close();
        // 获取输入流
        InputStream inputStream = new FileInputStream(file);

        int i;
        // 单字符读取
//        while ((i = inputStream.read()) != -1){
//            System.out.println((char)i);
//        };
        // 一次读取1024字节
        byte[] b = new byte[1024];
//        while ((i = inputStream.read(b)) != -1){
//            System.out.println(new String(b));
//        }
        // 一次读取一行
        int size = inputStream.available();
        b = new byte[size];
        inputStream.read(b);
        System.out.println(new String(b));
        // 关闭流
        inputStream.close();
    }

    private static void writerDemo(File file) throws IOException{
        OutputStream outputStream = new FileOutputStream(file);
        // 构建outputStreamWriter对象
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream,"UTF-8");
        outputStreamWriter.write("中文");
        outputStreamWriter.write("\r\n");
        outputStreamWriter.write("english");
        // 自动写入文件
        outputStreamWriter.close();
        // 构建输入流
        InputStream inputStream = new FileInputStream(file);
        // 构建inputStreamReader
        InputStreamReader reader = new InputStreamReader(inputStream);
        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            sb.append((char)reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
    }

}
