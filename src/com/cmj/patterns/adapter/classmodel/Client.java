package com.cmj.patterns.adapter.classmodel;

/**
 * @Author :  chenmj
 * @Created :  2019/6/20
 * @Since :  0.1.0
 * @Description
 */
public class Client {

    public static void main(String args[]) {
        Target target = new Adapter();
        target.request();
    }

}
