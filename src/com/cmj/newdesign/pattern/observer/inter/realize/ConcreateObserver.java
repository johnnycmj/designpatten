package com.cmj.newdesign.pattern.observer.inter.realize;

/**
 * Created by Administrator on 2018/4/27.
 */
public class ConcreateObserver implements Observer {

    @Override
    public void update(String content) {
        System.out.println("接收到观察者的通知，通知内容：" + content);
    }
}
