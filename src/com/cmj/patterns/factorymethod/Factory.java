package com.cmj.patterns.factorymethod;


/**
 * @Author :  chenmj
 * @Created :  2019/7/3
 * @Since :  0.1.0
 * @Description
 */
public abstract class Factory {

    public abstract <T extends Product> T createProduct(Class<T> c);
}
