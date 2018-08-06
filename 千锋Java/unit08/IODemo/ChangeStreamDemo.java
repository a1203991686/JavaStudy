package com.unit08.IODemo;

import java.io.*;
import java.nio.charset.Charset;

/**
 * 转换流
 *  OutputStreamWriter：可以将输出的字符流转换为字节流的输出形式
 *  InputStreamReader：可以将输入的字节流转换为字符流输入形式
 * Created by littlecorgi_a1203991686 on 2018/08/06 10:43.
 */
public class ChangeStreamDemo {

    public static void main(String[] args) throws IOException {
        // InputStream in = new FileInputStream("d:\\test\\1.txt");
        // read(in);
        OutputStream out = new FileOutputStream("d:\\test\\1.txt");
        write(out);
    }

    private static void read(InputStream in) throws IOException {
        Reader reader = new InputStreamReader(in, Charset.forName("UTF-8"));
        char[] cs = new char[1024];
        int len = -1;
        while ( (len = reader.read(cs)) != -1){
            System.out.println(new String(cs, 0, len));
        }
        reader.close();
    }

    private static void write(OutputStream out){
        Writer outWriter = new OutputStreamWriter(out, Charset.defaultCharset());
        try {
            outWriter.write("开开心心来玩耍\r\n");
            outWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
