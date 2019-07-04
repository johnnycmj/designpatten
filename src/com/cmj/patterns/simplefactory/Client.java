package com.cmj.patterns.simplefactory;

/**
 * @Author :  chenmj
 * @Created :  2019/7/3
 * @Since :  0.1.0
 * @Description
 */
public class Client {

    public static void main(String args[]) {
        Product p1 = Factory.createFactory(Factory.PRODUCT_A);
        p1.use();

        Product p2 = Factory.createFactory(Factory.PRODUCT_B);
        p2.use();

    }

}
