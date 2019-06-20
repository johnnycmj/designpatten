package com.cmj.patterns.proxy.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/20
 * @Since :  0.1.0
 * @Description
 */
public class Proxy implements Subject {

    private RealSubject subject;

    public Proxy() {
        subject = new RealSubject();
    }

    @Override
    public void request() {
        preRequest();
        subject.request();
        afterRequest();
    }

    private void preRequest() {
        System.out.println("访问Proxy的 preRequest..");
    }

    private void afterRequest() {
        System.out.println("访问Proxy的 afterRequest..");
    }
}
