package com.unit11.No07_URL;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/09 9:54.
 */
public class URLDemo {
    public static void main(String[] args) {
        // URL 统一资源定位符
        try {
            URL url = new URL("http://b.hiphotos.baidu.com/image/pic/item/d52a2834349b033bda94010519ce36d3d439bdd5.jpg");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            BufferedInputStream in = new BufferedInputStream(conn.getInputStream());
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("d:\\test\\123.jpg"));
            byte[] bytes = new byte[1024];
            int len = -1;
            while ( (len = in.read(bytes)) != -1){
                out.write(bytes, 0, len);
            }
            in.close();
            out.close();
            System.out.println("下载成功!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
