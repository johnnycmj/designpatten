package com.cmj.patterns.decorator.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/19
 * @Since :  0.1.0
 * @Description 具体构件
 */
public class ConcreateComponent implements Component {

    public ConcreateComponent() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
