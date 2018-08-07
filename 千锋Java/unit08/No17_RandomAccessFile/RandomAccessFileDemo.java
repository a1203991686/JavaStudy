package com.unit08.No17_RandomAccessFile;

import java.io.RandomAccessFile;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/07 9:04
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) {
        try {
            // 读取文件
            RandomAccessFile r = new RandomAccessFile("d:\\test\\1.png", "r");
            // 写入文件
            RandomAccessFile w = new RandomAccessFile("d:\\test\\1-temp.png", "rw");

            byte[] bytes = new byte[1024];
            int len = -1;
            while ( (len = r.read(bytes)) != -1){
                w.write(bytes, 0, len);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        System.out.println("copy success!!");

    }
}
