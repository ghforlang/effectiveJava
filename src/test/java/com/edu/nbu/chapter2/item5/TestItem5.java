package com.edu.nbu.chapter2.item5;

import org.junit.Test;

import java.util.Date;
import java.util.Stack;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-20 15:35
 *  
 */
public class TestItem5 {

    //常量尽可能声明为常量（性能提高1000倍）
    @Test
    public void testJust() {
        Date birthDate = new Date();
        Person person = new Person(birthDate);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            person.isBabyBoomer();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("timeCost : " + (endTime - startTime));

        Person1 person1 = new Person1(birthDate);
        startTime = System.currentTimeMillis();
        for (int i = 0; i <10000000 ; i++) {
            person1.isBabyBoomer();
        }
        endTime = System.currentTimeMillis();
        System.out.println("timeCost : " + (endTime - startTime));

    }

    //有将近10倍性能的提高(避免不必要的自动装箱、解箱)
    @Test
    public void testAutoBoxxing(){
        Long sum = 0L;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
            sum += i;
        }
        System.out.println(sum);
        long endTime = System.currentTimeMillis();
        System.out.println("timecost : " + (endTime -startTime));

        long sumx = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
            sumx += i;
        }
        sum = Long.valueOf(sumx);
        System.out.println(sum);
        endTime = System.currentTimeMillis();
        System.out.println("timecost : " + (endTime -startTime));

        Stack<String> stack;
    }

}
