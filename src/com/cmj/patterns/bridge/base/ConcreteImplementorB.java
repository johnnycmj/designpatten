package com.cmj.patterns.bridge.base;

/**
 * @Author :  chenmj
 * @Created :  2019/7/30
 * @Since :  0.1.0
 * @Description
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorB");
    }
}
