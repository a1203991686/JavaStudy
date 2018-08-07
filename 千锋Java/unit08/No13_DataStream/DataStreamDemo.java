package com.unit08.No13_DataStream;

import java.io.*;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/06 16:59
 */
public class DataStreamDemo {

    public static void main(String[] args) {
        // write();
        read();
    }

    private static void write(){
        File file = new File("d:\\test\\1.bat");
        try {
            OutputStream out = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(out);
            DataOutputStream dos = new DataOutputStream(bos);
            dos.writeInt(10); //写入4个字节
            dos.writeByte(1); //写入1个字节
            dos.writeUTF("中"); //写入3个字节

            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read(){
        File file = new File("d:\\test\\1.bat");
        try {
            InputStream out = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(out);
            DataInputStream dis = new DataInputStream(bis);
            int num = dis.readInt();
            byte b = dis.readByte();
            String s = dis.readUTF();
            System.out.println(num + " ," + b + "," + s);
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
