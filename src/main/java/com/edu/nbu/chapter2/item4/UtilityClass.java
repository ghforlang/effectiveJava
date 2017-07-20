package com.edu.nbu.chapter2.item4;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-20 15:31
 *  
 */
//工具类不可实例化，添加私有构造器以强化
public class UtilityClass {
    public static final String DEFAULT_NAME = "util";
    //Suppresses default constructor, ensuring non-instantiability
    private UtilityClass(){
        throw new AssertionError();
    }

    public static String getDefaultNameEXT(){
        return DEFAULT_NAME + "_EXT";
    }

}
