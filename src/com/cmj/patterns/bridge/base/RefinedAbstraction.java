package com.cmj.patterns.bridge.base;

/**
 * @Author :  chenmj
 * @Created :  2019/7/30
 * @Since :  0.1.0
 * @Description 扩充抽象类
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    void operationImpl() {
        implementor.operationImpl();
    }
}
