package com.unit08.No18_Properties;

import java.io.*;
import java.util.Properties;

/**
 * Properties：
 * properties可以用来做配置文件
 * javaWeb javaee 开发中通常会用到
 *
 * ResourceBundle 只读
 * Properties 可读可写
 *
 * Created by littlecorgi_a1203991686 on 2018/08/07 9:22
 */
public class PropertiesDemo {
    private static String version = "";
    private static String username = "";
    private static String password = "";

    // 静态代码块，只会执行一次
    static {
        readConfig();
    }

    public static void main(String[] args) {
        writeConfig("1.0", "admin", "123456");

        // readConfig();
        System.out.println(PropertiesDemo.version);
        System.out.println(PropertiesDemo.username);
        System.out.println(PropertiesDemo.password);
    }

    /**
     * 读取properties配置文件
     */
    private static void readConfig(){
        Properties p = new Properties();
        try {
            InputStream inStream = new FileInputStream("d:\\test\\config.properties");
            p.load(inStream); //加载文件

            // 从properties中获取数据
            version = p.getProperty("app.version");
            username = p.getProperty("db.username");
            password = p.getProperty("db.password");

            inStream.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 对属性文件的写操作
     * @param version 软件的版本
     * @param username 用户名
     * @param password 密码
     */
    private static void writeConfig(String version, String username, String password){
        Properties p = new Properties();
        p.put("app.version", version);
        p.put("db.username", username);
        p.put("db.password", password);
        try {
            OutputStream outStream = new FileOutputStream("d:\\test\\config.properties");

            // 写文件
            p.store(outStream, "update config");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
