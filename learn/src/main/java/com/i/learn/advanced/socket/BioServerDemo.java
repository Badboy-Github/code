package com.i.learn.advanced.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BioServerDemo {

    public static void main(String[] args){
        ServerSocket server = null;
        try{
            int port = 8081;
            // 创建线程池
            ExecutorService service = Executors.newFixedThreadPool(50);
            // 创建服务器
            server = new ServerSocket(port);
            System.out.println("Socket服务器已启动");
            // 一直监听端口
            while (true){
                // 阻塞等待客户端连接
                Socket socket = server.accept();
                BioHandler bioHandler = new BioHandler(socket);
                service.execute(bioHandler);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            if(server != null){
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            server = null;
        }
    }

}
