package com.cmj.newdesign.pattern.clone;

/**
 * Created by Administrator on 2018/5/9.
 */
public class ConcreatePrototype implements Cloneable {

    @Override
    protected Object clone(){

        ConcreatePrototype prototype = null;

        try{

            prototype = (ConcreatePrototype)super.clone();

        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototype;
    }
}
