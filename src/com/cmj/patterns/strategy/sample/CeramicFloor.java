package com.cmj.patterns.strategy.sample;

/**
 * @Author :  chenmj
 * @Created :  2019/6/20
 * @Since :  0.1.0
 * @Description 瓷砖
 */
public class CeramicFloor implements Flooring {
    @Override
    public void flooring() {
        System.out.println("工人铺瓷砖地板");
    }
}
