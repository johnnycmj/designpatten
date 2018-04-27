package com.cmj.newdesign.pattern.observer;

import java.util.Vector;

/**
 * Created by Administrator on 2018/4/27.
 */
public class Subject {

    private Vector<Observer> observers = new Vector<>();

    public void attach(Observer o){
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer o : observers) {
            o.update();
        }
    }


}
