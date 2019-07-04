package com.cmj.patterns.factorymethod;

/**
 * @Author :  chenmj
 * @Created :  2019/7/3
 * @Since :  0.1.0
 * @Description
 */
public class ConcreteProductB extends Product {
    @Override
    public void use() {
        System.out.println("ConcreteProductB use");
    }

    public void testB() {
        System.out.println("ConcreteProductB testB");
    }

}
