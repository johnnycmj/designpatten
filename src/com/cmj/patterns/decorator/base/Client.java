package com.cmj.patterns.decorator.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/19
 * @Since :  0.1.0
 * @Description
 */
public class Client {

    public static void main(String args[]) {

        Component component = new ConcreateComponent();
        component.operation();

        Component component1 = new ConcreateDecoratorA(component);
        component1.operation();

        Component component2 = new ConcreateDecoratorB(component1);
        component2.operation();

    }
}
