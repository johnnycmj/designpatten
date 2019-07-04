package com.cmj.patterns.simplefactory;


/**
 * @Author :  chenmj
 * @Created :  2019/7/3
 * @Since :  0.1.0
 * @Description
 */
public class Factory {

    public static final String PRODUCT_A = "A";
    public static final String PRODUCT_B = "B";


    /**
     * 根据传进来的标识创建对应的类
     * @param flag
     * @return
     */
    public static Product createFactory(String flag) {

        if(flag == null) {
            return null;
        }

        if(PRODUCT_A.equals(flag)) {
            return new ConcreteProductA();
        } else {
            return new ConcreteProductB();
        }
    }
}
