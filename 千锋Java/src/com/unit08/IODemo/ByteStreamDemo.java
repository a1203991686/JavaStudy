package com.unit08.IODemo;

import java.io.*;

/**
 * 字节输出输入流
 * 输出流：
 *      超类：OutputStream，对文件的输出流使用子类FileOutputStream
 * 输入流：
 *      超类：InputStream，对文件的输入流使用子类FileInputStream
 * 输入输出字节流操作原理，每次只会操作一个字节，（从文件中读取或写入）
 * Created by littlecorgi_a1203991686 on 2018/08/05 21:26.
 */
public class ByteStreamDemo {

    private static void in(){
        // 0.确定目标文件
        File file = new File("d:\\test\\1.txt");
        // 1.构建一个文件输入流对象
        try {
            InputStream in = new FileInputStream(file);

            byte[] bytes = new byte[21];
            StringBuilder sb = new StringBuilder();
            int len = -1; //表示每次读取的字节长度 -1表示没有
            // 把数据读入到数组中，并返回读取的字节数，当不等于-1时，表示读取到数据，等于-1表示文件已经读完了
            while ((len = in.read(bytes)) != -1){
                // 根据读取到的字节数组，再转换为字符串内容，添加到StringBuilder中
                sb.append(new String(bytes, 0, len));
            }

            // 打印内容
            System.out.println(sb);

            // 关闭输入流
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void out(){
        // 0.确定目标文件
        File file = new File("d:\\test\\1.txt");
        // 1.构建一个文件输出流对象
        try {
            OutputStream out = new FileOutputStream(file, true); //append为true表示追加内容
            // 2.输出的内容
            String info = "小河流水哗啦啦\r\n"; //\r\n表示换行

            String line = System.getProperty("File.separator");//获取换行符
            // 3.把内容写入到文件
            out.write(info.getBytes());
            // 4.关闭流
            out.close();
            System.out.println("write success.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // out();
        in();
    }
}
