package com.cmj.patterns.facade.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/19
 * @Since :  0.1.0
 * @Description 外观角色
 */
public class Facade {

    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();

    /**
     * 外观模式的入口
     */
    public void warpOpration() {
        systemA.operationA();
        systemB.operationB();
        systemC.operationC();
    }

}
