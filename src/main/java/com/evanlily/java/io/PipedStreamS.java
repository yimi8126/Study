package com.evanlily.java.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * User: 一米
 * Date: 13-7-26
 * Time: 下午3:47
 * Description:管道流类PipedInputStream类和PipedOutputStream类用于在应用程序中创建管道通信。
 * 一个PipedInputStream实例对象必须和PipedOutputStream实例对象进行连接而产生一个通信管道，
 * PipedOutputsStream可以向管道中写入数据，
 * PipedInputStream可以从管道中读取PipedOutputStream写入的数据，
 * 这两个类主要用来完成线程之间的通信，
 * 一个线程的PipedInputStream对象能够从另外一个线程的PipedOutputStream对象中读取数据。
 */
public class PipedStreamS {
    public static void main(String[] args) {
          Sender sender=new Sender();
        Receiver receiver=new Receiver();
        try {
            sender.getOS().connect(receiver.getPos());
            sender.start();
            receiver.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class Sender extends Thread{
    PipedOutputStream pos=new PipedOutputStream();
    public PipedOutputStream getOS(){
        return pos;
    }
    @Override
    public void run() {
        String message="fuck you ";
        try {
            pos.write(message.getBytes());
            Thread.sleep(10000);
            pos.write("fuck with you ".getBytes());
            pos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Receiver extends Thread{
    PipedInputStream pis=new PipedInputStream();
    public PipedInputStream getPos(){
        return pis;
    }
    byte[] date=new byte[1024];
    @Override
    public void run() {
        try {
            while (true){
            int read = pis.read(date);
                if(read>0){
                    System.out.println("收到数据"+new String(date,0,read));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
