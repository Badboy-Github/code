package com.i.learn.design.behavior.chain;

public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(String request) {
        if("1".equals(request)){
            System.out.println("请求1被处理.");
            if(getNext() == null){
                System.out.println("请求处理完成.");
            }
        }else {
            if(getNext() != null){
                getNext().handleRequest(request);
            }else {
                System.out.println("请求处理完成。");
            }
        }
    }
}
