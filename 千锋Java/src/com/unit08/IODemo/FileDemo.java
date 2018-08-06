package com.unit08.IODemo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * File类的使用
 * Created by littlecorgi_a1203991686 on 2018/08/05 18:31.
 */
public class FileDemo {
    public static void main(String[] args) {
        // File类表示一个文件或目录
        // File f1 = new File("D:\\test\\1.txt");
        File f1 = new File("D:" + File.separator + "test" + File.separator + "1.txt");
        if (!f1.exists()){ // 判断文件是否存在
            try {
                System.out.println(f1.createNewFile());
                System.out.println("文件创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // f1.isFile() 是否为文件
        System.out.println("isFile:" + f1.isFile());
        // f1.isDirectory() 是否为文件夹
        System.out.println("isDirectory:" + f1.isDirectory());

        // f1.delete() 删掉文件夹\文件     当文件夹中有内容时，无法删除
        File f2 = new File("D:\\test\\my");
        System.out.println(f2.delete());

        // f2.list() 列出当前目录下所有文件以及文件夹(只列出名字)
        String[] names = f2.list();
        System.out.println(Arrays.toString(names));

        // f2.listFiles() 列出当前目录下所有文件及文件夹，以file对象返回
        File[] fs = f2.listFiles();
        if (fs != null) {
            for (File f : fs) {
                System.out.print("文件名称" + f.getName() + " ");
                System.out.print("文件大小" + f.length() + " ");
                System.out.print("相对路径" + f.getPath() + " ");
                System.out.print("绝对路径" + f.getAbsolutePath() + " ");
                System.out.print("是否为隐藏文件" + f.isHidden() + " ");
                System.out.print("是否可读" + f.canRead() + " ");
                Date date = new Date(f.lastModified());
                DateFormat df = new SimpleDateFormat("HH:MM:SS");
                System.out.println("最后修改时间" + df.format(date) + " ");
            }

            // 相对路径与绝对路径的区别
            File f3 = new File("temp.txt");
            System.out.println(f3.getPath());
            System.out.println(f3.getAbsolutePath());

            // 创建文件夹
            File f4 = new File("d:\\test\\Linux");
            if (!f4.exists()){
                System.out.println(f4.mkdir());
            }

            // 重命名与移动文件
            // System.out.println(f4.renameTo(new File("d:\\test\\Ubuntu"))); //重命名
            System.out.println(f4.renameTo(new File("d:\\Linux"))); //移动

            // 根据过滤器列出文件夹里面的文件
            File f5 = new File("d:\\test\\my");
            File[] files = f5.listFiles(pathname -> pathname.getName().endsWith(".txt"));
            System.out.println("------------");
            if (files != null) {
                for (File f : files){
                    System.out.println(f.getName());
                }
            }
        }
    }
}
