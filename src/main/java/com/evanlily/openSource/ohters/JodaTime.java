package com.evanlily.openSource.ohters;

import org.joda.time.DateTime;

/**
 * User: 一米
 * Date: 13-7-17
 * Time: 下午4:58
 * Description:
 */
public class JodaTime {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.minusDays(10));
    }
}
