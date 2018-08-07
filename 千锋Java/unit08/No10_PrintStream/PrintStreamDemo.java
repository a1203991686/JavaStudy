package com.unit08.No10_PrintStream;

import java.io.*;

/**
 * 打印流：很方便的进行输出
 *
 * 字节打印流
 *  在字节输出时，可以增强输出功能
 * 字符打印流
 * Created by littlecorgi_a1203991686 on 2018/08/06 15:24
 */
public class PrintStreamDemo {
    public static void main(String[] args) {
        // bytePrint();
        charPrint();
    }

    public static void bytePrint(){
        File file = new File("d:\\test\\1.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            // 加缓存
            BufferedOutputStream bos = new BufferedOutputStream(out);
            // 增强打印功能
            PrintStream ps = new PrintStream(bos);
            ps.println("小河流水天天哗啦啦");
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void charPrint(){
        File file = new File("d:\\test\\1.txt");
        try {
            Writer out = new FileWriter(file);
            // 加缓存
            BufferedWriter bw = new BufferedWriter(out);
            // 增强打印功能
            PrintWriter ps = new PrintWriter(bw);
            ps.println("小河流水天天哗啦啦");
            ps.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
