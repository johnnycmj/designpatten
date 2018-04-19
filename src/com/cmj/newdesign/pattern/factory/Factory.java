package com.cmj.newdesign.pattern.factory;

/**
 * <pre>
 *     author: chmj
 *     time  : 2018/1/30
 *     desc  : 抽象工厂，为工厂方法的核心
 * </pre>
 */

public abstract class Factory {

    public abstract <T extends Product> T createProduct(Class<T> c);
}
