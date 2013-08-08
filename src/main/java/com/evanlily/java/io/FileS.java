package com.evanlily.java.io;

import java.io.File;
import java.io.IOException;

/**
 * User: 一米
 * Date: 13-7-18
 * Time: 下午4:14
 * Description:
 */
public class FileS {
    public static void main(String[] args) throws IOException {
        System.out.println(File.separator);
        System.out.println(File.separatorChar);
        System.out.println(File.pathSeparator);
        System.out.println(File.pathSeparatorChar);
        File dir=new File("D:\\");
        File fi=new File(dir,"adzone.csv");
        System.out.println(fi.getTotalSpace());

//        File tempFile = File.createTempFile("pre", "suffix");
//        System.out.println(tempFile.getPath());
    }
}
