package com.cmj.patterns.decorator.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/19
 * @Since :  0.1.0
 * @Description
 */
public class ConcreateDecoratorB extends Deccortor {

    public ConcreateDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehaviorB();

    }

    private void addBehaviorB() {
        System.out.println("ConcreateDecoratorB的额外方法");
    }
}
