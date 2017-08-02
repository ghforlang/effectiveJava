package com.edu.nbu;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-21 14:48
 *  
 */
public class TestOther {

    @Test
    public void testStr(){
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("name","zhagnsan");
        paramMap.put("age",12);
        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String,Object> entry: paramMap.entrySet()) {
            if(entry.getValue() != null){
                sb.append(entry.getKey() + "=");
                sb.append(entry.getValue());
                sb.append("&");
            }
        }
        System.out.println(sb.substring(0,sb.length()-1).toString());
    }
}
