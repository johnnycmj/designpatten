package com.cmj.patterns.adapter.classmodel;

/**
 * @Author :  chenmj
 * @Created :  2019/6/20
 * @Since :  0.1.0
 * @Description 类适配器类
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
