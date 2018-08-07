package com.unit08.No16_StringStream;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

/**
 * 字符串流：以一个字符串为数据源，来构造一个字符流
 * 作用：在WEB开发中，我们经常要从服务器上获取数据，数据的返回格式通过是一个字符串（XML，JSOn），我们需要把这个字符串构造成一个字符流
 * 然后在用第三方的数据解析器来解析数据
 * StringWriter
 * Created by littlecorgi_a1203991686 on 2018/08/06 20:58
 */
public class StringStreamDemo {

    public static void main(String[] args) {

    }

    private static void stringReader(){
        String info = "good good study day day up";
        StringReader sr = new StringReader(info);
        // 流标记器
        StreamTokenizer st = new StreamTokenizer(sr);

        int count = 0;
        while (st.ttype != StreamTokenizer.TT_EOF){
            try {
                if (st.nextToken() == StreamTokenizer.TT_WORD){
                    count++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        sr.close();
        System.out.println("count=" + count);
    }
}
