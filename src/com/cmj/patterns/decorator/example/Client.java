package com.cmj.patterns.decorator.example;

/**
 * @Author :  chenmj
 * @Created :  2019/6/19
 * @Since :  0.1.0
 * @Description
 */
public class Client {
    public static void main(String args[]) {
        House house = new NewHouse();

        System.out.println("普通装修-------");
        //普通装修
        House generalDecortor = new GeneralDecortor(house);
        generalDecortor.live();

        System.out.println("高级装修-------");
        // 高级装修
        House seniorDecortor = new SeniorDecortor(house);
        seniorDecortor.live();

    }
}
