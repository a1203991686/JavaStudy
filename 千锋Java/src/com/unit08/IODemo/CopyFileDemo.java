package com.unit08.IODemo;

import java.io.*;

/**
 * 文件的复制：
 *  从一个输入流中读取数据，然后通过输出流写入目标位置
 *  一边读一边写
 * Created by littlecorgi_a1203991686 on 2018/08/06 10:25.
 */
public class CopyFileDemo {

    public static void main(String[] args) {
        System.out.println("start copy...");
        copy("C:\\Users\\a1203\\Desktop\\西安邮电大学标志.png", "D:\\test\\1.png");
        System.out.println("copy success!");
    }

    private static void copy(String src, String target){
        File srcFile = new File(src);
        File targetFile = new File(target);
        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(targetFile);

            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = in.read(bytes)) != -1){
                out.write(bytes, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
