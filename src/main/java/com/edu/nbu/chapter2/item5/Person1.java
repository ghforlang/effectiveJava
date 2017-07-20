package com.edu.nbu.chapter2.item5;

import java.util.Calendar;
import java.util.Date;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-20 15:54
 *  
 */
public class Person1 {
    private final Date birthDate;

    private static final Date boomStart;
    private static final Date boomEnd;

    static{
        Calendar gmt = Calendar.getInstance();
        gmt.set(1946,Calendar.JANUARY,1,0,0,0);
        boomStart = gmt.getTime();

        gmt.set(1965,Calendar.JANUARY,1,0,0,0);
        boomEnd = gmt.getTime();
    }

    public Person1(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer(){
        return birthDate.after(boomStart)&&birthDate.before(boomEnd);
    }

}
