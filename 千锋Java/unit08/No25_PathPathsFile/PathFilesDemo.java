package com.unit08.No25_PathPathsFile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/07 15:13
 */
public class PathFilesDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\test\\1.png");

        // path
        Path p1 = Paths.get("d:\\test", "1.png");
        System.out.println(p1);

        Path p2 = file.toPath();
        System.out.println(p2);

        Path p3 = FileSystems.getDefault().getPath("d:\\test", "1.png");
        System.out.println(p3);

        // Files工具类
        Path p4 = Paths.get("d:\\test\\1.txt");
        String info = "村花到我家，一起...";

        // 写入文件
        Files.write(p4, info.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

        // 读取文件
        byte[] bytes = Files.readAllBytes(p4);
        System.out.println(new String(bytes));

        // 复制
        Files.copy(p3, Paths.get("d:\\test\\test\\1.png"), StandardCopyOption.REPLACE_EXISTING);

        // 移动
        Files.move(p3, Paths.get("d:\\test\\test\\2.png"), StandardCopyOption.REPLACE_EXISTING);
        Path p5 = Paths.get("d:\\test\\test\\2.png");
        Files.move(p5, Paths.get("d:\\test\\2.png"), StandardCopyOption.REPLACE_EXISTING);

        // 删除
        Path p6 = Paths.get("d:\\test\\test\\1.png");
        Files.delete(p6);

        // 创建新目录，除了最后一个部件，其他必须是存在的
        Files.createDirectory(Paths.get("d:\\test\\BB"));

        // 创建路径中的中间目录，能创建不存在的中间目录
        // 创建多级不存在的目录
        Files.createDirectories(Paths.get("d:\\test\\CC"));

        // 创建一个空文件，检查文件存在，如果已存在这抛出异常，而检查文件存在是原则性的，因此在此过程中无法执行文件创建操作
        Files.createFile(Paths.get("d:\\test\\BB\\BB.txt"));

        // 创建临时文件或临时目录
        // Path newPathFile = Files.createTempFile(dir, prefix, suffix);
        // Path newPathDirectory = Files.createTempDirectory(dir, prefix);
    }
}
