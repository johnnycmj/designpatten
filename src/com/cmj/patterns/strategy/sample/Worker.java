package com.cmj.patterns.strategy.sample;

/**
 * @Author :  chenmj
 * @Created :  2019/6/20
 * @Since :  0.1.0
 * @Description 工人
 */
public class Worker {
    private Flooring flooring;

    public void setFlooring(Flooring flooring) {
        this.flooring = flooring;
    }

    public void flooring() {
        flooring.flooring();
    }

}
