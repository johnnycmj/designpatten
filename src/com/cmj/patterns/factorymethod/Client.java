package com.cmj.patterns.factorymethod;

/**
 * @Author :  chenmj
 * @Created :  2019/7/3
 * @Since :  0.1.0
 * @Description
 */
public class Client {

    public static void main(String args[]) {
        ConcreteFactory concreteFactory = new ConcreteFactory();
        ConcreteProductA productA = concreteFactory.createProduct(ConcreteProductA.class);
        productA.use();
        productA.testA();
    }
}
