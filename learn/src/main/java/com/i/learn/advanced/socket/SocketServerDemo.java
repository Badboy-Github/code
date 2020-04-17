package com.i.learn.advanced.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class SocketServerDemo extends Thread {

    private ServerSocket serverSocket;

    public SocketServerDemo(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
//        serverSocket.setSoTimeout(10000);
    }

    @Override
    public void run() {
        while (true){
            try{
                System.out.println("服务器端口号："+serverSocket.getLocalPort());
                Socket socket = serverSocket.accept();
                System.out.println("远程主机IP地址："+socket.getRemoteSocketAddress());
                // 服务器输入流
                DataInputStream in = new DataInputStream(socket.getInputStream());
                System.out.println(in.readUTF());
                // 服务器输出流
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                out.writeUTF("谢谢你，我的地址："+socket.getLocalSocketAddress());
                socket.close();
            }catch (SocketTimeoutException e){
                e.printStackTrace();
                break;
            }catch (IOException e){
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        SocketServerDemo socketServer = new SocketServerDemo(8080);
        socketServer.start();
    }


}
