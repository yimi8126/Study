package com.evanlily.java.io;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * User: 一米
 * Date: 13-7-18
 * Time: 上午9:10
 * Description:
 */
public class CharArrayInputStreamS {
    public static void main(String[] args) throws IOException {
        char[] a=new char[100];
        for(int i=0;i<100;i++){
            a[i]= (char) i;
        }
        CharArrayReader cr=new CharArrayReader(a);
         int p;
        while ((p=cr.read())!=-1){
            System.out.println(p);
        }
    }
}
