package com.cmj.patterns.factorymethod;

/**
 * @Author :  chenmj
 * @Created :  2019/7/3
 * @Since :  0.1.0
 * @Description 具体产品角色
 */
public class ConcreteProductA extends Product {
    @Override
    public void use() {
        System.out.println("ConcreteProductA use");
    }

    public void testA() {
        System.out.println("ConcreteProductA testA");
    }

}
