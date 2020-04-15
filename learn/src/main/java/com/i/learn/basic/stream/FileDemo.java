package com.i.learn.basic.stream;

import java.io.File;

public class FileDemo {

    public static void main(String[] args){
        String dirName = "D:/test/s1/s2";
        File file = new File(dirName);
        file.mkdirs();
        String dir ="H:\\usr\\log";
        File file2 = new File(dir);
        showDir(file2);
        File folder = new File("H:\\usr\\log");
        deleteFolder(folder);
    }

    private static void showDir(File file){

        if(file.isDirectory()){
            System.out.println("目录："+file.getAbsolutePath());
            // 获取当前文件夹下的目录和文件
            String[] s = file.list();
            String dir1 = null;
            File file1 = null;
            for(String str : s){
                dir1 = file.getAbsolutePath()+"/"+str;
                file1 = new File(dir1);
                if(file1.isDirectory()){
                    System.out.println(file1.getName()+"是一个文件夹");
                    showDir(file1);
                }else {
                    System.out.println(file1.getName()+"是一个文件");
                }
            }
        }else {
            System.out.println(file.getName()+"不是一个文件夹");
        }
    }

    private static void deleteFolder(File folder){
        File[] files = folder.listFiles();
        if(files == null){
            System.out.println("文件夹不存在");
            return;
        }
        for(File file : files){
            if(file.isDirectory()){
                // 迭代删除
                deleteFolder(file);
            }else {
                // 删除文件
                file.delete();
            }
        }
        // 删除文件夹
        folder.delete();
    }


}
