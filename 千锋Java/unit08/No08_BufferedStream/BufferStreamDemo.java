package com.unit08.No08_BufferedStream;

import java.io.*;

/**
 * 缓存的目的：
 *  解决在写入文件操作时，频繁的操作文件所带来的性能降低
 * BufferedOutputStream内部默认的缓存大小是8kb，每次写入时先存储到缓存中的byte数组里，当数组存满时，会把数组中的数据写入文件
 * 并缓存下标归零
 * Created by littlecorgi_a1203991686 on 2018/08/06 11:44.
 *
 * 字符流
 *  1. 加入字符缓冲流，增强读取功能（readLine）
 *  2. 更高效的读取
 * FileReader：内部使用InputStreamReader（sun.nio.cs.StreamDecoder），解码过程，byte->char，默认缓存大小是8k
 * BufferedReader：默认缓存大小是8k，但可以手动指定缓存大小，把数据直接读取到缓存中去，减少每次转换过程，效率更高
 * BufferedWriter：同上
 */
public class BufferStreamDemo {

    public static void main(String[] args) throws IOException {
        // byteWriter();
        byteReader();
    }

    private static void byteWriter() throws IOException {
        File file = new File("d:\\test\\1.txt");
        OutputStream out = new FileOutputStream(file);
        // 构造一个字节缓冲流
        BufferedOutputStream bos = new BufferedOutputStream(out);

        //
        String info = "小河还是流水哗啦啦";
        bos.write(info.getBytes());
        bos.close();
        // out.close();
    }

    private static void byteReader() throws IOException {
        File file = new File("d:\\test\\1.txt");
        InputStream out = new FileInputStream(file);
        // 构造一个字节缓冲流
        BufferedInputStream bis = new BufferedInputStream(out);
        byte[] bytes = new byte[1024];
        int len = -1;
        while ( (len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }
        bis.close();
    }

    private static void charReader() throws IOException {
        File file = new File("d:\\test\\1.txt");
        Reader reader = new FileReader(file);
        // 为字符流提供缓冲，以达到高效读取的目的
        BufferedReader br = new BufferedReader(reader);
        char[] cs = new char[1024];
        int len = -1;
        while ( (len = br.read()) != -1){
            System.out.println(new String(cs, 0, len));
        }
        br.close();
    }

    private static void charWriter() throws IOException {
        File file = new File("d:\\test\\1.txt");
        Writer writer = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("村花到我家");
        bw.flush();
        bw.close();
    }
}
