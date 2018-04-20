package com.cmj.newdesign.pattern.builder;

/**
 * Created by Administrator on 2018/4/20.
 */
public class Test {

    public static void main(String args[]) {
        Builder builder = new ConcreateBuilder();

        AbstractTemplate product = builder.create();
        product.execute();
    }
}
