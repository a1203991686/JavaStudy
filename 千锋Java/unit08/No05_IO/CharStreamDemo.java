package com.unit08.No05_IO;

import java.io.*;

/**
 * 字符流
 *  字符输出流：Writer，对文件的操作使用子类：FileWriter
 *  字符输入流：Reader，对文件的操作使用子类：FileReader
 * 每次操作的单位是一个字符
 * 文件字符操作流会自带缓存，默认大小为1024，在缓存慢后，或手动刷新缓存，或关闭流时，会把数据写入文件
 * 直接操作流，默认每次执行写入操作会直接把数据写入文件
 *
 *
 * 总结：如果你要处理的流时可打印的字符，那么使用字符流会看上去简单一点。如果不确定，那么使用字节流总不会错的
 * 如何选择使用字节流还是字符流：
 *      一般操作非文本文件时，使用字节流
 *      操作文本文件时，建议使用字符流
 *
 * Created by littlecorgi_a1203991686 on 2018/08/06 9:51.
 */
public class CharStreamDemo {

    private static void in(){
        File file = new File("d:\\test\\1.txt");
        try {
            Reader in = new FileReader(file);
            char[] cs = new char[3];
            int len = -1;
            StringBuilder sb = new StringBuilder();
            while ( (len = in.read(cs)) != -1){
                sb.append(new String(cs, 0, len));
            }
            in.close();
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void out(){
        File file = new File("d:\\test\\1.txt");
        try {
            Writer out = new FileWriter(file, true);
            out.write(",村花到我家");

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // out();
        in();
    }
}
