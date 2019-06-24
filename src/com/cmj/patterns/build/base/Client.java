package com.cmj.patterns.build.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/24
 * @Since :  0.1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Builder builder= new ConcreateBuilder();
        Director director=new Director(builder);
        Product product=director.construct();
        product.show();
    }
}
