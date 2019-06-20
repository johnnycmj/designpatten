package com.cmj.patterns.decorator.example;

/**
 * @Author :  chenmj
 * @Created :  2019/6/19
 * @Since :  0.1.0
 * @Description
 */
public class SeniorDecortor extends Decortor {
    public SeniorDecortor(House house) {
        super(house);
    }

    @Override
    public void live() {
        hydroelectric();
        softDecora();
        furniture();
        super.live();
        more();
    }

    /**
     * 高级水电装修
     */
    private void hydroelectric(){
        System.out.println("高级水电装修");
    }

    /**
     * 高级软装
     */
    private void softDecora(){
        System.out.println("高级软装");
    }

    /**
     * 高级家具
     */
    private void furniture(){
        System.out.println("高级家具装修");
    }

    /**
     * 住进来后其他东西
     */
    private void more(){
        System.out.println("其他东西");
    }
}
