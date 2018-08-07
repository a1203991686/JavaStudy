package com.unit08.No11_ObjectStream;

import java.io.*;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/06 15:43
 */
public class ObjectStreamDemo {

    public static void main(String[] args) {
        // writerObject();
        // readObject();
        // writerObjects();
        readObjects();
    }

    /**
     * 对象序列化
     * 把对象写入文件：实际写入的是类名、属性名、属性类型、属性的值等
     */
    private static void writerObject(){
        Dog dog = new Dog("wangwang", 2, "母");
        File file = new File("d:\\test\\dog.obj");
        try {
            OutputStream out = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(dog);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 反序列化
     * 从文件中把对象的内容读取出来，还原成对象
     */
    private static void readObject(){
        File file = new File("d:\\test\\dog.obj");
        try {
            InputStream out = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(out);
            Dog dog = (Dog)ois.readObject();
            ois.close();
            System.out.println(dog);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void writerObjects(){
        Dog dog1 = new Dog("wangwang", 2, "母");
        Dog dog2 = new Dog("2哈", 3, "公");
        Dog[] dogs = {dog1, dog2};
        File file = new File("d:\\test\\dog.obj");
        try {
            OutputStream out = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(dogs);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readObjects(){
        File file = new File("d:\\test\\dog.obj");
        try {
            InputStream out = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(out);
            Dog[] dogs = (Dog[])ois.readObject();
            ois.close();
            for (Dog s : dogs){
                System.out.println(s);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
