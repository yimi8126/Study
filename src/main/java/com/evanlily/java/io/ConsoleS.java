package com.evanlily.java.io;

import java.io.Console;

/**
 * User: 一米
 * Date: 13-7-18
 * Time: 下午3:58
 * Description:必须是控制台启动的java程序才能使用这个类
 */
public class ConsoleS {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println(console);
        System.out.println(console.readLine());

    }
}
