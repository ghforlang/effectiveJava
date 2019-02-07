package com.edu.nbu.chapter3;

import com.edu.nbu.chapter3.item1.CaseInsensitiveString;
import org.junit.Test;

/**
 * Created by lenovo on 2017/8/9.
 */
public class TestItem1 {

    @Test
    public void  testCaseSensitiveString(){
        CaseInsensitiveString cis = new CaseInsensitiveString("xxx");
        String s = "xxx";
        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));
    }
}
