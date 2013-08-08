package com.evanlily.java.io;

import java.io.FileReader;
import java.io.LineNumberReader;

/**
 * User: 一米
 * Date: 13-7-25
 * Time: 下午7:52
 * Description:
 */
public class LineNumberReaderS {
    public static void main(String[] args) throws Exception{
        LineNumberReader lnr=null;
        try {
             lnr=new LineNumberReader(new FileReader("E:\\WorkSpace\\Study\\java\\target\\classes\\file.txt"));
            String line;
            while ((line=lnr.readLine())!=null){
                System.out.println(line);
                if (lnr.getLineNumber()==3){
                    lnr.mark(10);
                }
            }
        lnr.reset();
        while ((line=lnr.readLine())!=null){
            System.out.println(line);
        }
        } finally {
            lnr.close();
        }
    }
}
