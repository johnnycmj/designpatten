package com.cmj.patterns.build.base;

/**
 * @Author :  chenmj
 * @Created :  2019/6/24
 * @Since :  0.1.0
 * @Description
 */
public class Product {

    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        System.out.println("partA = " + partA + " partB = " + partB + " partC = " + partC);
    }

}
