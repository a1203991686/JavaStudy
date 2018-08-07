package com.unit08.No12_ByteArrayStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * 字节数组流
 * 基于内存操作，内部维护着一个字节数组，我们可以利用流的读取机制，来处理字符串
 * 无需关闭
 * Created by littlecorgi_a1203991686 on 2018/08/06 16:41
 */
public class ByteArrayStreamDemo {
    public static void main(String[] args) {
        byteArray();
    }

    private static void byteArray(){
        String s = "123456789asdfer@#$%&FCVBDF";
        ByteArrayInputStream bais = new ByteArrayInputStream(s.getBytes());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int curr = -1;//每次读取的字节数
        while ( (curr = bais.read()) != -1){
            if ( (curr >= 65 && curr <= 90) || (curr >= 97 && curr <= 122)){
                baos.write(curr);
            }
        }
        System.out.println(baos.toString());
    }
}
