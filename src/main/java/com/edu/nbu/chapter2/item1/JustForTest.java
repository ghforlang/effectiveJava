package com.edu.nbu.chapter2.item1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-19 15:46
 *  
 */
public class JustForTest {
    public static Boolean valueOf(boolean val){
        return val ? Boolean.TRUE : Boolean.FALSE;
    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        Collections.sort(strList);
        EnumSet<? extends Enum> enumSet = null;
    }
}
