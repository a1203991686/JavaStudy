package com.unit08.IODemo;

import java.io.*;

/**
 * 缓存的目的：
 *  解决在写入文件操作时，频繁的操作文件所带来的性能降低
 * BufferedOutputStream内部默认的缓存大小是8kb，每次写入时先存储到缓存中的byte数组里，当数组存满时，会把数组中的数据写入文件
 * 并缓存下标归零
 * Created by littlecorgi_a1203991686 on 2018/08/06 11:44.
 */
public class BufferStreamDmeo {

    public static void main(String[] args) {
        // byteWriter();
        byteReader();
    }

    private static void byteWriter(){
        File file = new File("d:\\test\\1.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            // 构造一个字节缓冲流
            BufferedOutputStream bos = new BufferedOutputStream(out);


            //
            String info = "小河还是流水哗啦啦";
            bos.write(info.getBytes());

            bos.close();
            // out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void byteReader(){
        File file = new File("d:\\test\\1.txt");
        try {
            InputStream out = new FileInputStream(file);
            // 构造一个字节缓冲流
            BufferedInputStream bis = new BufferedInputStream(out);

            byte[] bytes = new byte[1024];
            int len = -1;
            while ( (len = bis.read(bytes)) != -1){
                System.out.println(new String(bytes, 0, len));
            }

            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
