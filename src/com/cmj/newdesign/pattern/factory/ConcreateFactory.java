package com.cmj.newdesign.pattern.factory;

/**
 * <pre>
 *     author: chmj
 *     time  : 2018/1/30
 *     desc  :
 * </pre>
 */

public class ConcreateFactory extends Factory {

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;

        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T)product;
    }
}
