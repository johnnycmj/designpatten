package com.cmj.patterns.proxy.sample;

/**
 * @Author :  chenmj
 * @Created :  2019/6/20
 * @Since :  0.1.0
 * @Description
 */
public class RealExpress implements Express {

    @Override
    public void getExpress() {
        System.out.println("取出快递");
    }
}
