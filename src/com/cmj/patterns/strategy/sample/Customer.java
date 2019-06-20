package com.cmj.patterns.strategy.sample;

/**
 * @Author :  chenmj
 * @Created :  2019/6/20
 * @Since :  0.1.0
 * @Description 客户
 */
public class Customer {

    public static void main(String args[]) {
        System.out.println("客户要铺地板");
        Worker worker = new Worker();
        System.out.println("跟工人说铺瓷砖");
        worker.setFlooring(new CeramicFloor());
        worker.flooring();

        System.out.println("跟工人说铺木地板");
        worker.setFlooring(new WoodFloor());
        worker.flooring();
    }
}
