package com.cmj.newdesign.pattern.observer;

/**
 * Created by Administrator on 2018/4/27.
 */
public class ConcreteSubject extends Subject {

    public void doSomeThings(){
        System.out.println("被观察者做了一些事 ...");
        notifyObservers();
    }
}
