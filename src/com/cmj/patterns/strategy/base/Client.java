package com.cmj.patterns.strategy.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/20
 * @Since :  0.1.0
 * @Description
 */
public class Client {
    public static void main(String args[]) {
        Context context = new Context();
        System.out.println("--------调用策略A----------");
        context.setStrategy(new ConcreateStrategyA());
        context.algorithm();
        System.out.println("--------调用策略B----------");
        context.setStrategy(new ConcreateStrategyB());
        context.algorithm();
    }
}
