package com.cmj.patterns.proxy.sample;

/**
 * @Author :  chenmj
 * @Created :  2019/6/20
 * @Since :  0.1.0
 * @Description 蜂巢
 */
public class FcBox implements Express {

    private RealExpress express;

    public FcBox() {
        express = new RealExpress();
    }

    @Override
    public void getExpress() {
        preExpress();
        getSF();
        getYT();
        getST();
        express.getExpress();
        afterExpress();
    }

    private void preExpress() {
        System.out.println("开始取快递");
    }

    private void getSF() {
        System.out.println("取出顺丰快递");
    }

    private void getYT() {
        System.out.println("取出圆通快递");
    }

    private void getST() {
        System.out.println("取出申通快递");
    }

    private void afterExpress() {
        System.out.println("取快递结束");
    }
}
