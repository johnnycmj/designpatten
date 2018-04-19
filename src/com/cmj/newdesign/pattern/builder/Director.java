package com.cmj.newdesign.pattern.builder;

public class Director {
    private Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.builderMethod1();
        builder.builderMethod2();
        builder.builderMethod3();
    }
}
