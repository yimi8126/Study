package com.evanlily.java.io;

import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * User: 一米
 * Date: 13-7-26
 * Time: 下午6:24
 * Description:
 */
public class PipedReaderS {
    public static void main(String[] args) {
        Sender1 sender=new Sender1();
        Receiver1 receiver=new Receiver1();
        try {
            sender.getOS().connect(receiver.getPos());
            sender.start();
            receiver.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class Sender1 extends Thread{
    PipedWriter pos=new PipedWriter();
    public PipedWriter getOS(){
        return pos;
    }
    @Override
    public void run() {
        String message="fuck you ";
        try {
            pos.write(message);
            Thread.sleep(10000);
            pos.write("fuck with you . again ");
            pos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Receiver1 extends Thread{
    PipedReader pis=new PipedReader();
    public PipedReader getPos(){
        return pis;
    }
    @Override
    public void run() {
        try {
            char[] date=new char[1024];
            while (true){
                int read = pis.read(date);
                if(read>0){
                    System.out.println("收到数据"+new String(date,0,read));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
