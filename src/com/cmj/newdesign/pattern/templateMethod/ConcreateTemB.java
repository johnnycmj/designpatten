package com.cmj.newdesign.pattern.templateMethod;

/**
 * <pre>
 *     author: chmj
 *     time  : 2018/2/26
 *     desc  :
 * </pre>
 */

public class ConcreateTemB extends AbstractTemplate {
    @Override
    protected void method1() {
        System.out.println("Bmethod1");
    }

    @Override
    protected void method2() {
        System.out.println("Bmethod2");
    }

    @Override
    protected void method3() {
        System.out.println("Bmethod3");
    }
}
