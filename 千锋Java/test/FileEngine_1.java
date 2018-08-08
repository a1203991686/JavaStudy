package com.test;

import java.io.*;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/08 14:50.
 */
public class FileEngine_1 {
    public static void main(String args[]){
        FireEngine a=new FireEngine();
        a.setID(001);
        a.setDistance(23);
        FireEngine b=new FireEngine();
        b.setID(002);
        b.setDistance(13);
        FireEngine c=new FireEngine();
        c.setID(003);
        c.setDistance(25);
        FireEngine[] engines1 = {a, b, c};
        File file=new File("C:\\Users\\a1203\\Desktop\\fire.txt");
        try {
            FileOutputStream fileout = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileout);
            objectOut.writeObject(engines1);
            objectOut.close();
            InputStream filein=new FileInputStream(file);
            ObjectInputStream objectin= new ObjectInputStream(filein);
            FireEngine[] engines = (FireEngine[]) objectin.readObject();
            objectin.close();   //保存后从文件读取对象
            for (FireEngine s : engines){
                if (s.distance > 20){
                    System.out.println(s);
                }
            }
            //距离大于20就输出洒水车的

        } catch (ClassNotFoundException e) {

            System.out.print("不能读出对象");
        } catch (IOException e) {
            System.out.print(e);
        }
    }
}
