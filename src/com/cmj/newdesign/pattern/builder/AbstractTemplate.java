package com.cmj.newdesign.pattern.builder;

/**
 * <pre>
 *     author: chmj
 *     time  : 2018/2/26
 *     desc  :
 * </pre>
 */

public abstract class AbstractTemplate {

    protected void method1() {
        System.out.println("method1");
    }

    protected void method2() {
        System.out.println("method2");
    }

    protected void method3() {
        System.out.println("method3");
    }

    /**
     * 一般模板方法前加一个final，不允许子类随意修改
     */
    public final void execute() {
        this.method1();
        this.method2();
        this.method3();
    }
}
