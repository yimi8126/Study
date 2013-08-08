package com.evanlily.java.nio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * User: 一米
 * Date: 13-7-24
 * Time: 上午8:59
 * Description:
 */
public class BufferS {
    public static void main(String[] args) {
        ByteBuffer bf=ByteBuffer.allocate(10);
        for(int i=0;i<10;i++){
            bf.put((byte) i);
        }
        bf.flip();
        bf.mark();
        for(int i=0;i<10;i++){
            System.out.println(bf.get());
        }
        bf.order(ByteOrder.BIG_ENDIAN);
        bf.reset();
        for(int i=0;i<10;i++){
            System.out.println(bf.get());
        }
    }
}
