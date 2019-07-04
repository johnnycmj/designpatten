package com.cmj.patterns.abstractfactory;

/**
 * @Author :  chenmj
 * @Created :  2019/7/3
 * @Since :  0.1.0
 * @Description
 */
public class Client {

    public static void main(String args[]) {
        AbstractFacotry facotry = new ConcreateFactory1();
        facotry.createProductA().use();
        facotry.createProductB().eat();

        AbstractFacotry facotry2 = new ConcreateFactory2();
        facotry2.createProductA().use();
        facotry2.createProductB().eat();


    }

}
