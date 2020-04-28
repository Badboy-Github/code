package com.i.learn.design.construct.abstractfactory;

/**
 * 科技公司
 */
public interface ScienceTechnologyCompany {

    /**
     * 生产电脑
     * @return
     */
    Computer produceComputer();

    /**
     * 生产手机
     * @return
     */
    Phone producePhone();

}
