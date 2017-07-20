package com.edu.nbu.chapter2.item3;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-20 14:36
 *  
 */
public class TestSingleton {

    @Test
    public void testOne(){
        System.out.println(Singleton.INSTANCE.getNum());
    }

    //通过反射可修改final类型属性
    @Test
    public void testTwo() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Singleton instance = Singleton.INSTANCE.getInstance();
        System.out.println(instance.getNum());
    }

    @Test
    public void testThree(){
        Singleton2 a = Singleton2.getInstance();
        Singleton2 b = Singleton2.getInstance();
        System.out.println(a == b);
        System.out.println(a.getNum());
    }

    @Test
    public void testFour() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        System.out.println(SingletonEnum.INSTANCE.getNum());
        SingletonEnum a = SingletonEnum.INSTANCE;
        //仍然可以修改对应属性值？
//        SingletonEnum.buildSingletonEnum();
        Class clazz = Class.forName("com.edu.nbu.chapter2.item3.SingletonEnum");
        Field field = clazz.getDeclaredField("num");
        field.setAccessible(true);
        field.set(SingletonEnum.INSTANCE,30);
        System.out.println(SingletonEnum.INSTANCE.getNum());
        SingletonEnum b = SingletonEnum.INSTANCE;
        System.out.println(a == b);
    }
}
