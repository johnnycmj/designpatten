package com.cmj.patterns.abstractfactory;

/**
 * @Author :  chenmj
 * @Created :  2019/7/3
 * @Since :  0.1.0
 * @Description
 */
public class ConcreateFactory1 extends AbstractFacotry {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
