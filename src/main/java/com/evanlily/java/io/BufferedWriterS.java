package com.evanlily.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * User: 一米
 * Date: 13-7-17
 * Time: 下午7:50
 * Description:
 */
public class BufferedWriterS {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw=null;
        try {
             bw=new BufferedWriter(new FileWriter("E:\\WorkSpace\\Study\\java\\target\\classes\\file.txt"));
            for(int i=0;i<100;i++){
                bw.write(i);
                if(i%10==0){
                    bw.newLine();
                }
            }
        } finally {
            bw.close();
        }
    }
}
