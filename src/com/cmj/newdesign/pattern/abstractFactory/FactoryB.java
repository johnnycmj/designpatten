package com.cmj.newdesign.pattern.abstractFactory;

/**
 * <pre>
 *     author: chmjs
 *     time  : 2018/2/7
 *     desc  :
 * </pre>
 */

public class FactoryB extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreateProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreateProductB2();
    }
}
