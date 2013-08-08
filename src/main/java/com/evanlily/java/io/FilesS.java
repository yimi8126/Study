package com.evanlily.java.io;

import com.google.common.io.Files;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * User: 一米
 * Date: 13-7-17
 * Time: 上午11:27
 * Description:
 */
public class FilesS {
    public static void main(String[] args) throws Exception{
//        System.out.println(readFirstLine("C:\\Users\\Administrator\\Desktop\\Temp.txt"));
        ByteBuffer b=ByteBuffer.allocate(1);
        b.put((byte) 1);
        b.put((byte) 1);
    }

    public static String readFirstLine(String filePath) throws Exception {
        return Files.readFirstLine(new File(filePath), Charset.forName("utf-8"));
    }
}
