package com.evanlily.java.io;

/**
 * User: 一米
 * Date: 13-7-15
 * Time: 下午7:38
 * Description:
 */
public class AllPathS {
    public static void main(String[] args) {
//        得到的是当前的classpath的绝对URI路径。
        System.out.println(AllPathS.class.getResource("/"));
//        得到的是当前类class文件的URI目录。不包括自己！
        System.out.println(AllPathS.class.getResource(""));
        System.out.println(AllPathS.class.getClassLoader().getResource(""));
        System.out.println(System.getProperty("user.dir"));
    }
}
