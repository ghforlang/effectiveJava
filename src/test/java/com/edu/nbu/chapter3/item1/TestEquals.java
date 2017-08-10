package com.edu.nbu.chapter3.item1;

import org.junit.Test;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-08-10 18:45
 *  
 */
public class TestEquals {

    @Test
    public void testEquals(){
        CaseInsensitiveString cis = new CaseInsensitiveString("xxx");
        String s = "xxx";
        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));
    }
}
