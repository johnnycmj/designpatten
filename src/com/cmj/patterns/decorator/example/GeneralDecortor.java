package com.cmj.patterns.decorator.example;


import sun.rmi.runtime.Log;

/**
 * @Author :  chenmj
 * @Created :  2019/6/19
 * @Since :  0.1.0
 * @Description
 */
public class GeneralDecortor extends Decortor {


    public GeneralDecortor(House house) {
        super(house);
    }

    @Override
    public void live() {
        hydroelectric();
        furniture();
        super.live();
    }

    /**
     * 水电装修
     */
    private void hydroelectric(){
        System.out.println("普通水电装修");
    }

    /**
     * 普通家具
     */
    private void furniture(){
        System.out.println("普通家具装修");
    }
}
