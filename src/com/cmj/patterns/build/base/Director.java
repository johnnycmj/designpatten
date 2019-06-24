package com.cmj.patterns.build.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/24
 * @Since :  0.1.0
 * @Description
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder=builder;
    }

    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
