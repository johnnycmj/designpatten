package com.cmj.patterns.build.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/24
 * @Since :  0.1.0
 * @Description
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }
}
