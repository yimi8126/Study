package com.evanlily.java.io;

import java.io.File;
import java.io.FileFilter;

/**
 * User: 一米
 * Date: 13-7-15
 * Time: 下午7:00
 * Description:
 */
public class FileFiterS {
    public static void main(String[] args) {
        File path=new File("E:\\WorkSpace");
        File[] files=path.listFiles(new KeyWordFilter("rm"));
        for (int i=0;i<files.length;i++){
            System.out.println(files[i].getName());
        }

    }
}

class KeyWordFilter implements FileFilter {
    private String key;

    public KeyWordFilter(String key) {
        this.key = key;
    }

    @Override
    public boolean accept(File pathname) {
//        System.out.println(pathname.getName());
        return pathname.getName().toLowerCase().contains(key);
    }
}
