package com.evanlily.java.util;

import java.util.Calendar;

/**
 * User: 一米
 * Date: 13-7-22
 * Time: 下午4:19
 * Description:
 */
public class CalendarS {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.add(Calendar.DAY_OF_MONTH,-7);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH,1);
        calendar.add(Calendar.SECOND,-1);
        System.out.println(calendar.getTime());
//        System.out.println(calendar.getTime());
    }
}
