package com.cmj.patterns.proxy.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/20
 * @Since :  0.1.0
 * @Description 真实主题角色
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("访问真实主题方法..");
    }
}
