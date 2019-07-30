package com.cmj.patterns.bridge.base;

/**
 * @Author :  chenmj
 * @Created :  2019/7/30
 * @Since :  0.1.0
 * @Description
 */
public class Client {

    public static void main(String args[]) {
        ConcreteImplementorA a = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(a);
        abstraction.operationImpl();

        ConcreteImplementorB b = new ConcreteImplementorB();
        Abstraction abstractionb = new RefinedAbstraction(b);
        abstractionb.operationImpl();
    }
}
