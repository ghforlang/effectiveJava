package com.edu.nbu.chapter2.item4;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-20 15:24
 *  
 */
public class TestItem4 {

    @Test
    public void test(){
        int n = Math.abs(-123);
        Arrays.asList(n);
        Collections.sort(Arrays.asList(n));
    }
}
