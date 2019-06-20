package com.cmj.patterns.strategy.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/20
 * @Since :  0.1.0
 * @Description
 */
public class ConcreateStrategyB implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("策略B方法被执行");
    }
}
