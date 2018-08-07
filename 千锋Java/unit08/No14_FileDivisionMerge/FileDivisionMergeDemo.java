package com.unit08.No14_FileDivisionMerge;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 有bug！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * Created by littlecorgi_a1203991686 on 2018/08/06 17:26
 */
public class FileDivisionMergeDemo {

    public static void main(String[] args) {
        // File file = new File("d:\\test\\1.mp4");
        // division(file, 1024*1024*20);
        try {
            InputStream in1 = new FileInputStream(new File("d:\\test\\1-temp-1.mp4"));
            InputStream in2 = new FileInputStream(new File("d:\\test\\2-temp-1.mp4"));
            InputStream in3 = new FileInputStream(new File("d:\\test\\3-temp-1.mp4"));
            InputStream in4 = new FileInputStream(new File("d:\\test\\4-temp-1.mp4"));
            InputStream in5 = new FileInputStream(new File("d:\\test\\5-temp-1.mp4"));

            // 集合工具类，内部实现使用了数组
            Vector<InputStream> v = new Vector<>();
            v.add(in1);
            v.add(in2);
            v.add(in3);
            v.add(in4);
            v.add(in5);

            Enumeration es = v.elements();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件的分割
     * @param targetFile 要分割的目标文件
     * @param cutSize 每个文件的大小
     */
    private static void division(File targetFile, long cutSize){
        if (targetFile == null){
            return;
        }
        // 计算总分割的文件数
        int num = targetFile.length()%cutSize==0 ? (int)(targetFile.length()/cutSize) : (int)(targetFile.length()%cutSize)+1;

        // 构造一个文件输入流
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(targetFile));
            BufferedOutputStream out = null;

            byte[] bytes = null; //每次要读取的字节数组
            int len = -1;
            int count = 0; //每一个文件要读取的次数

            for (int i = 0; i < num; i++) {
                out = new BufferedOutputStream(new FileOutputStream(new File("d:\\test\\" + (i+1) + "-temp-" + targetFile.getName())));
                if (cutSize <= 1024){
                    bytes = new byte[(int)cutSize];
                    count = 1;
                } else {
                    bytes = new byte[1024];
                    count = (int)cutSize/1024;
                }

                while (count > 0 && (len = in.read(bytes)) != -1){
                    out.write(bytes, 0, len);
                    out.flush();
                    count--;
                }

                if (cutSize % 1024 != 0){
                    bytes = new byte[(int)cutSize%1024];
                    len = in.read(bytes);
                    out.write(bytes, 0, len);
                    out.flush();
                    out.close();
                }
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件的合并
     */
    private static void merge(Enumeration<InputStream> es){
        SequenceInputStream sis = new SequenceInputStream(es);
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\test\\1.mp4"));
            byte[] bytes = new byte[1024];
            int len = -1;
            while ( (len = sis.read(bytes)) != -1){
                bos.write(bytes, 0, len);
                bos.flush();
            }
            bos.close();
            sis.close();
            System.out.println("合并完成");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
