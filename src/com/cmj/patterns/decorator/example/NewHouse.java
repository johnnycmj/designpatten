package com.cmj.patterns.decorator.example;

/**
 * @Author :  chenmj
 * @Created :  2019/6/19
 * @Since :  0.1.0
 * @Description
 */
public class NewHouse extends House {
    @Override
    public void live() {
        System.out.println("人住进来");
    }
}
