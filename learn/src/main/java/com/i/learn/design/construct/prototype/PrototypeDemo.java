package com.i.learn.design.construct.prototype;

/**
 * 原型类
 * @author Thanos
 * @since 2020/4/28
 */
public class PrototypeDemo implements Cloneable{

    public PrototypeDemo(){
        System.out.println("原型类创建成功");
    }

    @Override
    protected PrototypeDemo clone() throws CloneNotSupportedException {
        return (PrototypeDemo) super.clone();
    }

    public static void main(String[] args){
        // 原型对象
        PrototypeDemo prototypeDemo = new PrototypeDemo();
        // 复制原型对象
        try{
            PrototypeDemo copyDemo = prototypeDemo.clone();
            System.out.println("prototypeDemo==copyDemo:"+(prototypeDemo == copyDemo));
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
