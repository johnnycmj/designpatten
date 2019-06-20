package com.cmj.patterns.proxy.sample;

/**
 * @Author :  chenmj
 * @Created :  2019/6/20
 * @Since :  0.1.0
 * @Description
 */
public class Client {

    public static void main(String args[]) {
        Express express = new FcBox();
        express.getExpress();
    }
}
