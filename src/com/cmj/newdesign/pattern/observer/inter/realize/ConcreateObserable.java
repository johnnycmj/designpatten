package com.cmj.newdesign.pattern.observer.inter.realize;

import java.util.Vector;

/**
 * Created by Administrator on 2018/4/27.
 */
public class ConcreateObserable implements Observable {

    private Vector<Observer> observers = new Vector<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObServer(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String content) {
        for(Observer o : observers) {
            o.update(content);
        }
    }
}
