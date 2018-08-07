package com.unit08.No24_CopyFile;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 比较IO操作的性能：
 *  1. 内存映射最快 MappedByteBuffer
 *  2. NIO读写文件
 *  3. 使用了缓存的IO流
 *  4. 无缓存的IO流
 * Created by littlecorgi_a1203991686 on 2018/08/07 14:48
 */
public class CopyFileDemo {

    /**
     *
     * @throws IOException IO异常
     */
    private static void randomAccessFileCopy() throws IOException {
        RandomAccessFile in = new RandomAccessFile(new File("d:\\test\\1.png"), "r");
        RandomAccessFile out = new RandomAccessFile("d:\\test\\test\\1.png", "rw");

        FileChannel fcIn = in.getChannel();
        FileChannel fcOut = out.getChannel();

        long size = fcIn.size(); //输入流的字节大小
        // 输入流的缓冲区
        MappedByteBuffer inBuf = fcIn.map(FileChannel.MapMode.READ_ONLY, 0, size);
        // 输出流的缓冲区
        MappedByteBuffer outBuf = fcOut.map(FileChannel.MapMode.READ_WRITE, 0, size);

        for (int i = 0; i < size; i++) {
            outBuf.put(inBuf.get(i));
        }

        // 关闭（关闭通道时会写入数据块）
        fcIn.close();
        fcOut.close();
        in.close();
        out.close();
    }

    /**
     * 通过文件通道实现文件复制
     * @throws IOException IO异常
     */
    private static void copyFile() throws IOException {
        // 创建一个输入文件的通道
        FileChannel fcIn = new FileInputStream("d:\\test\\1.png").getChannel();
        // 创建一个输出文件的通道
        FileChannel fcOut = new FileOutputStream("d:\\test\\test\\1.png").getChannel();

        ByteBuffer buf = ByteBuffer.allocate(1024);
        while (fcIn.read(buf) != -1){
            buf.flip();
            fcOut.write(buf);
            buf.clear();
        }
        fcIn.close();
        fcOut.close();
        System.out.println("copy success!!!");
    }

    public static void main(String[] args) {
        try {
            copyFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
