package com.cmj.newdesign.pattern.observer;

/**
 * Created by Administrator on 2018/4/27.
 */
public class Client {

    public static void main(String args[]) {

        //被观察者
        ConcreteSubject subject = new ConcreteSubject();
        //观察者
        Observer observer = new ConcreateObserver();
        //注册观察者
        subject.attach(observer);

        subject.doSomeThings();
    }
}
