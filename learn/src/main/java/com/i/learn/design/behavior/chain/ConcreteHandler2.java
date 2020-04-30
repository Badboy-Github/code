package com.i.learn.design.behavior.chain;

public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(String request) {
        if("2".equals(request)){
            System.out.println("请求2被处理.");
            if(getNext() == null){
                System.out.println("请求处理完成.");
            }
        }else {
            if(getNext() != null){
                getNext().handleRequest(request);
            }else {
                System.out.println("没人处理请求了。");
            }
        }
    }
}
