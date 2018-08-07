package com.unit08.No23_NewIO;

import java.nio.ByteBuffer;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/07 11:42
 */
public class NIODemo {

    public static void main(String[] args) {
        // 创建一个字节缓冲区，申请的内存空间为8个字节
        ByteBuffer buf = ByteBuffer.allocate(8);

        System.out.println("position=" + buf.position());
        System.out.println("limit=" + buf.limit());
        System.out.println("capacity=" + buf.capacity());

        System.out.println("------------------");
        // 向缓缓区中写入数据
        buf.put((byte)10);
        buf.put((byte)20);
        buf.put((byte)30);
        buf.put((byte)40);

        System.out.println("position=" + buf.position());
        System.out.println("limit=" + buf.limit());
        System.out.println("capacity=" + buf.capacity());
        System.out.println("------------------");

        // 缓冲区反转
        buf.flip();
        System.out.println("position=" + buf.position());
        System.out.println("limit=" + buf.limit());
        System.out.println("capacity=" + buf.capacity());

        // 告知在当前位置和限制之间是否有元素
        if (buf.hasRemaining()){
            // 返回当前位置与限制之间的元素数
            for (int i = 0; i < buf.remaining(); i++) {
                byte  b = buf.get(i);
                System.out.println(b);
            }
        }
    }
}
