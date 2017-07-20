package com.edu.nbu.chapter2.item3;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-20 14:58
 *  
 */
public enum SingletonEnum {
    INSTANCE(20);
    private int num;

    private SingletonEnum(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

//    public static void buildSingletonEnum() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
//        Class clazz = Class.forName("com.edu.nbu.chapter2.item3.SingletonEnum");
//        Field field = clazz.getDeclaredField("num");
//        field.setAccessible(true);
//        field.set(INSTANCE,30);
//        System.out.println(INSTANCE.getNum());
//    }

}
