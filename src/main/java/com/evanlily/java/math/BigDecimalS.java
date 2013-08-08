package com.evanlily.java.math;

import java.math.BigDecimal;

/**
 * User: 一米
 * Date: 13-7-23
 * Time: 下午3:26
 * Description:
 */
public class BigDecimalS {
    public static void main(String[] args) {
        BigDecimal a=new BigDecimal("1.23");
        BigDecimal b=new BigDecimal("2.32");
        System.out.println(new BigDecimal("0.00").intValue()==0);

        System.out.println(a.subtract(b).divide(b,2,BigDecimal.ROUND_HALF_UP));
    }
}
