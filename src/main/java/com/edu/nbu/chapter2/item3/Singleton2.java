package com.edu.nbu.chapter2.item3;

import java.io.Serializable;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-20 14:51
 *  
 */
//静态工厂方法实现单例模式
public class Singleton2 implements Serializable{
    private static transient final Singleton2 INSTANCE = new Singleton2(12);

    private Integer num;

    private Singleton2(int num){
        this.num = num;
    }

    public static Singleton2 getInstance(){
        return INSTANCE;
    }

    public Integer getNum() {
        return num;
    }

    private Object readResolve(){
        return INSTANCE;
    }
}
