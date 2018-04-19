package com.cmj.newdesign.pattern.abstractFactory;

/**
 * <pre>
 *     author: chmj
 *     time  : 2018/2/7
 *     desc  :
 * </pre>
 */

public class FactoryA extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreateProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreateProductB1();
    }
}
