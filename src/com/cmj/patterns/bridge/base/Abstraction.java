package com.cmj.patterns.bridge.base;

/**
 * @Author :  chenmj
 * @Created :  2019/7/30
 * @Since :  0.1.0
 * @Description 定义抽象类，并包含一个对实现化对象的引用。
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }


    abstract void operationImpl();
}
