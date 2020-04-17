package com.i.learn.advanced.socket;

import java.io.*;
import java.net.Socket;

public class BioHandler implements Runnable {

    private Socket socket;

    public BioHandler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedReader reader = null;
        PrintWriter writer = null;
        try{

            reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8"));
            writer = new PrintWriter(
                    new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
            String readMessage = null;
            while(true){
                System.out.println("server reading... ");
                if((readMessage = reader.readLine()) == null){
                    break;
                }
                System.out.println(readMessage);
                writer.println("server recive : " + readMessage);
                writer.flush();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            socket = null;
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            reader = null;
            if(writer != null){
                writer.close();
            }
            writer = null;
        }
    }
}
