package com.evanlily.java.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * User: 一米
 * Date: 13-7-26
 * Time: 上午11:16
 * Description:
 */
public class ObjectInputStreamS {
    public static void main(String[] args) throws Exception{
//        People a=new People("234",234L);
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\WorkSpace\\Study\\java\\target\\classes\\object.txt"));
//        oos.writeObject(a);
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\WorkSpace\\Study\\java\\target\\classes\\object.txt"));
//        People pe = (People) ois.readObject();
//        System.out.println(pe.getName());
    }
}
