package com.cmj.patterns.decorator.example;

/**
 * @Author :  chenmj
 * @Created :  2019/6/19
 * @Since :  0.1.0
 * @Description
 */
public abstract class Decortor extends House {

    private House mHouse;

    public Decortor(House house){
        this.mHouse = house;
    }

    /**
     * 引用传进来的对象去调用对应对象的方法。
     *
     */
    @Override
    public void live() {
        mHouse.live();
    }
}
