package com.edu.nbu.chapter2.item3;

import java.lang.reflect.Field;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-20 14:26
 *  
 */
public class Singleton {
    public static final Singleton INSTANCE = new Singleton(12);
    private Integer num;
    private Singleton(int num){
        this.num = num;
    }


    public  Singleton getInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class clazz = Class.forName("com.edu.nbu.chapter2.item3.Singleton");
        Field field = clazz.getDeclaredField("num");
        System.out.println("before -" + field.getName() + " : " + field.isAccessible());
        field.setAccessible(true);
        field.set(INSTANCE,20);
        System.out.println("after -" + field.getName() + " : " + field.isAccessible());
        return INSTANCE;
    }

    public int getNum() {
        return num;
    }
}
