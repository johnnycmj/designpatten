package com.cmj.newdesign.pattern.proxy.dynamic;

import com.cmj.newdesign.pattern.proxy.RealSubject;
import com.cmj.newdesign.pattern.proxy.Subject;

import java.lang.reflect.Proxy;


/**
 * Created by Administrator on 2018/5/2.
 */
public class Client {

    public static void main(String args[]) {

        //构造真实实现类
        Subject subject = new RealSubject();
        //构造一个动态代理
        DynamicProxy proxy = new DynamicProxy(subject);
        //获取被代理的ClassLoader
        ClassLoader classLoader = subject.getClass().getClassLoader();

        //动态构造一个代理者
        Subject subjectProxy = (Subject)Proxy.newProxyInstance(classLoader,new Class[]{Subject.class},proxy);

        subjectProxy.request();



    }
}
