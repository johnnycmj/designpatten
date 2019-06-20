package com.cmj.patterns.decorator.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/19
 * @Since :  0.1.0
 * @Description
 */
public class ConcreateDecoratorA extends Deccortor {

    public ConcreateDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehaviorA();

    }

    private void addBehaviorA() {
        System.out.println("ConcreateDecoratorA的额外方法");
    }
}
