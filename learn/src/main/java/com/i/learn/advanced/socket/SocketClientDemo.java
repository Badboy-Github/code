package com.i.learn.advanced.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketClientDemo {

    public static void main(String[] args) throws IOException {
        String serverIp = "localhost";
        int port = 8080;
        Socket socket = new Socket(serverIp,port);
        System.out.println("服务器地址："+socket.getRemoteSocketAddress());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeUTF("Hello world");
        DataInputStream in = new DataInputStream(socket.getInputStream());
        System.out.println(in.readUTF());
    }

}
