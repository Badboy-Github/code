package com.i.learn.basic.hash;

public class Consumer {

    private String account;

    private String createTime;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + account != null ? account.hashCode() : 0;
        result = 31 * result + createTime != null ? createTime.hashCode() : 0;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        // 对象为NULL默认失败
        if(obj == null)return false;
        // 判断对象属于类
        if(!(obj instanceof Consumer))return false;
        // 判断对象的所有变量是否相等
        Consumer consumer = (Consumer)obj;
        if(consumer.getAccount().equalsIgnoreCase(this.account) &&
                consumer.getCreateTime().equalsIgnoreCase(this.createTime)){
            return true;
        }
        return false;
    }
}
