package com.cmj.newdesign.pattern.proxy;

/**
 * Created by Administrator on 2018/5/2.
 */
public class ProxySubject implements Subject {

    private Subject mSubject;

    public ProxySubject(Subject subject) {
        this.mSubject = subject;
    }

    public void before(){
        System.out.println("代理开始前准备");
    }

    public void after(){
        System.out.println("代理结束");
    }

    @Override
    public void request() {
        before();
        mSubject.request();
        after();
    }
}
