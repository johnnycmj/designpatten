package com.cmj.newdesign.pattern.proxy;

/**
 * Created by Administrator on 2018/5/2.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {

        System.out.println("实际完成人");
    }
}
