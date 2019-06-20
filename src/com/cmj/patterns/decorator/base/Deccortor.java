package com.cmj.patterns.decorator.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/19
 * @Since :  0.1.0
 * @Description
 */
public class Deccortor implements Component {

    private Component component;

    public Deccortor(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
