package com.unit08.IODemo;

import java.io.File;

/**
 * 在指定目录中，查找文件
 * Created by littlecorgi_a1203991686 on 2018/08/05 20:55.
 */
public class FileDemo2 {
    public static void main(String[] args) {
        findFile(new File("d:\\test\\my"), ".txt");
    }

    /**
     * 查找文件的方法
     * @param target 文件目录
     * @param ext 文件的后缀
     */
    private static void findFile(File target, String ext){
        if (target == null) return;

        if (target.isDirectory()){ //如果文件是目录
            File[] files = target.listFiles();
            if (files != null){
                for (File f : files){
                    findFile(f, ext); //递归调用
                }
            }
        } else { //此处表示File是一个文件
            String  name = target.getName().toLowerCase();
            if (name.endsWith(ext) || target.getName().endsWith(ext)){
                System.out.println(target.getAbsolutePath());
            }
        }
    }
}
