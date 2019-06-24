package com.cmj.patterns.build.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/24
 * @Since :  0.1.0
 * @Description
 */
public class ConcreateBuilder extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA("建造PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造PartC");
    }
}
