package com.edu.nbu.chapter2.item5;

import java.util.Calendar;
import java.util.Date;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-20 15:42
 *  
 */
public class Person {
    private final Date bithDate;

    public Person(Date bithDate) {
        this.bithDate = bithDate;
    }

    public boolean isBabyBoomer(){
        Calendar gmtCal = Calendar.getInstance();

        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        Date boomStartTime = gmtCal.getTime();

        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        Date boomEndTime = gmtCal.getTime();

        return bithDate.after(boomStartTime)  && bithDate.before(boomEndTime);
    }
}
