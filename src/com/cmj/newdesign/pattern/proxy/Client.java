package com.cmj.newdesign.pattern.proxy;

/**
 * Created by Administrator on 2018/5/2.
 */
public class Client {

    public static void main(String args[]) {
        Subject subject = new RealSubject();

        ProxySubject proxySubject = new ProxySubject(subject);
        proxySubject.request();
    }
}
