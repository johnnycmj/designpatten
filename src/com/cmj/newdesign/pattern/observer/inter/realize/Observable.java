package com.cmj.newdesign.pattern.observer.inter.realize;

/**
 * Created by Administrator on 2018/4/27.
 */
public interface Observable {

    void addObserver(Observer observer);

    void deleteObServer(Observer observer);

    void notifyObservers(String content);
}
