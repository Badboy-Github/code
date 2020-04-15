package com.i.learn.basic.exception;

public class CardNoException extends Exception {

    public CardNoException(String msg){
        this.setMsg(msg);
    }

    // 异常原因
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
