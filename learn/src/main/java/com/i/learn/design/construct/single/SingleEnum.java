package com.i.learn.design.construct.single;

// 枚举模式
public enum SingleEnum {

    INSTANCE;

    private DBConnection dbConnection = null;

    private SingleEnum() {
        dbConnection = new DBConnection();
    }

    public DBConnection getDBConnection(){
        return dbConnection;
    }

}
