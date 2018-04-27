package com.cmj.newdesign.pattern.observer;

/**
 * Created by Administrator on 2018/4/27.
 */
public class ConcreateObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接收到被观察者做的事情，触发通知");
    }
}
