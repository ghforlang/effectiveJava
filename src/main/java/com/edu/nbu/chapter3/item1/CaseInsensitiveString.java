package com.edu.nbu.chapter3.item1;

import com.sun.org.apache.xalan.internal.xsltc.dom.CachedNodeListIterator;

/**
 * Created by lenovo on 2017/8/9.
 */

/**
 * 违反对称性
/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-08-10 18:33
 *  
 */
public final class CaseInsensitiveString {
    private String s;

    public CaseInsensitiveString(String s) {
        if(null == s){
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CaseInsensitiveString){
            return ((CaseInsensitiveString)obj).s.equalsIgnoreCase(s);
        }
        if(obj instanceof String){
            return s.equalsIgnoreCase((String)obj);
        }
        return false;
    }
}
