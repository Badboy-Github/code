package com.i.learn.design.structure.facade;

/**
 * 外观
 */
public class Facade {

    private SubSystem1 subSystem1 = new SubSystem1();

    private SubSystem2 subSystem2 = new SubSystem2();

    public void method(){
        subSystem1.method1();
        subSystem2.method2();
    }

}
