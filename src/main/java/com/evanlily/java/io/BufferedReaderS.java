package com.evanlily.java.io;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * User: 一米
 * Date: 13-7-17
 * Time: 下午7:50
 * Description:
 */
public class BufferedReaderS {
    public static void main(String[] args) throws Exception{
        BufferedReader br=null;
        try {
             br = new BufferedReader(new FileReader("E:\\WorkSpace\\Study\\java\\target\\classes\\file.txt"));
            String s;
            while ((s= br.readLine())!=null){
                System.out.println(s);
            }
        } finally {
            br.close();
        }
    }
}
