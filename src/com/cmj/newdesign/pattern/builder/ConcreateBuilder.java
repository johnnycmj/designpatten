package com.cmj.newdesign.pattern.builder;


public class ConcreateBuilder extends Builder {

    AbstractTemplate template = new ConcreateTemA();


    @Override
    protected void builderMethod1() {
        template.method1();
    }

    @Override
    protected void builderMethod2() {
        template.method2();
    }

    @Override
    protected void builderMethod3() {
        template.method3();
    }

    @Override
    protected AbstractTemplate create() {

        return template;
    }
}
