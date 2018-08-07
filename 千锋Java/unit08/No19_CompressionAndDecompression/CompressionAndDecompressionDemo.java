package com.unit08.No19_CompressionAndDecompression;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * 压缩与解压缩
 * Created by littlecorgi_a1203991686 on 2018/08/07 10:12
 */
public class CompressionAndDecompressionDemo {

    public static void main(String[] args) {
        // compression("d:\\test\\test.zip", new File("d:/test/1.txt"));
        decompression("d:\\test\\test.zip", "d:\\test\\test");
    }

    /**
     * 压缩
     */
    private static void compression(String zipFileName, File targetFile){
        System.out.println("正在压缩...");
        try {
            // 要生成的压缩文件
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
            BufferedOutputStream bos = new BufferedOutputStream(out);
            zip(out, targetFile, targetFile.getName(), bos);
            bos.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("压缩完成！！！");
    }

    // zip
    private static void zip(ZipOutputStream zOut, File targetFile, String name, BufferedOutputStream bos) throws IOException {
        // 如果是个目录
        if (targetFile.isDirectory()){
            File[] files = targetFile.listFiles();
            if (files != null && files.length == 0) { //空文件夹
                zOut.putNextEntry(new ZipEntry(name + "/")); //处理空目录
            }
            if (files != null) {
                for (File f : files){
                    // 递归处理
                    zip(zOut, targetFile, name + "/" + f.getName(), bos);
                }
            }
        } else {
            zOut.putNextEntry(new ZipEntry(name));
            InputStream in = new FileInputStream(targetFile);
            BufferedInputStream bis = new BufferedInputStream(in);
            byte[] bytes = new byte[1024];
            int len = -1;
            while ( (len = bis.read(bytes)) != -1){
                bos.write(bytes, 0, len);
            }
            bis.close();
        }
    }

    /**
     * 解压
     */
    private static void decompression(String targetFileName, String parent){
        try {
            // 构建解压输入流
            ZipInputStream zIn = new ZipInputStream(new FileInputStream(targetFileName));
            ZipEntry entry = null;
            File file = null;
            while ( (entry = zIn.getNextEntry()) != null && !entry.isDirectory()){
                file = new File(parent, entry.getName());
                if (!file.exists()){
                    new File(file.getParent()).mkdirs(); //创建此文件的上级目录
                }
                OutputStream out = new FileOutputStream(file);
                BufferedOutputStream bos = new BufferedOutputStream(out);
                byte[] bytes = new byte[1024];
                int len = -1;
                 while ( (len = zIn.read(bytes)) != -1){
                     bos.write(bytes, 0, len);
                 }
                 bos.close();
            }
            if (file != null) {
                System.out.println(file.getAbsolutePath() + "解压成功");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
