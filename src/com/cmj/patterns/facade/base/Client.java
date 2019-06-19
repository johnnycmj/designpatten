package com.cmj.patterns.facade.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/19
 * @Since :  0.1.0
 * @Description
 */
public class Client {

    public static void main(String args[]) {
        Facade facade = new Facade();
        facade.warpOpration();
    }
}
