package com.evanlily.openSource.ohters;

/**
 * User: 一米
 * Date: 13-7-17
 * Time: 上午8:37
 * Description:最终会停止
 */
public class FinallyStop {
    public static void main(String[] args) {
        fs(2342343);
    }

    public static void fs(int i) {
        while (i != 1) {
            if (i % 2 == 0) {
                System.out.println("even-->" + i);
                i = i / 2;
            } else {
                System.out.println("odd-->" + i);
                i = 3 * i + 1;
            }
        }
    }
}
