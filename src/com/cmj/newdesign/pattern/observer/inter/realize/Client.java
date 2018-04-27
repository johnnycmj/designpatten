package com.cmj.newdesign.pattern.observer.inter.realize;

/**
 * Created by Administrator on 2018/4/27.
 */
public class Client {

    public static void main(String args[]) {

        //被观察者
        ConcreateObserable obserable = new ConcreateObserable();
        //观察者
        Observer observer = new ConcreateObserver();
        //注册观察者
        obserable.addObserver(observer);

        obserable.notifyObservers("观察者通知信息");

    }
}
