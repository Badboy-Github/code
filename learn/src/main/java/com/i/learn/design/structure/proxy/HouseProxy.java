package com.i.learn.design.structure.proxy;

// 代理类
public class HouseProxy implements HouseOwner {

    private PolyTY polyTY = new PolyTY();

    private PolyPZ polyPZ = new PolyPZ();

    @Override
    public void display() {
        // 代理类调用具体实现类方法
        polyTY.display();
        // 切换代理
//        polyTY.display();
    }
}
