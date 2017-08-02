package com.edu.nbu.chapter2.item6;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-21 11:08
 *  
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }


    public Object pop(){
        if(size == 0){
            throw new EmptyStackException();
        }

//        return elements[--size];//存在内存泄漏
        //优化方案
        Object o = elements[--size];
        elements[size] = null;
        return o;
    }

    public void push(Object o){
        ensureCapacity();
        elements[size ++] = o;
    }

    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements,2 * size + 1);
        }
    }
}
