package com.evanlily.java.io;

import java.io.*;

/**
 * User: 一米
 * Date: 13-7-15
 * Time: 下午7:22
 * Description:
 */
public class BufferedInputStreamS {
    public static void main(String[] args) {
        copy("E:\\WorkSpace\\Study\\java\\target\\classes\\file.txt", "E:\\WorkSpace\\Study\\java\\target\\classes\\fileCopy.txt");
    }

    public static void copy(String from, String to) {
        try {
            File toF = new File(to);
            if (!toF.exists()) {
                toF.createNewFile();
            }
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(from));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(toF));
            byte[] buffer = new byte[1000];
            while (bis.read(buffer) != -1) {
                bos.write(buffer);
            }
            bis.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}
