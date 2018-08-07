package com.unit08.No21_Decorator;

import java.io.*;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/07 11:24
 */
public class Test {
    public static void main(String[] args) {

        try {
            OutputStream out = new FileOutputStream(new File("d:\\test\\1.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(out);
            PrintStream ps = new PrintStream(bos);
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        Drink drink = new SoyaBeenMilk();
        SugarDecorator sugar = new SugarDecorator(drink);
        EggDecorator egg = new EggDecorator(sugar);
        BlackBeenDecorator blackBeen = new BlackBeenDecorator(egg);

        System.out.println(blackBeen.cost() + ":" + blackBeen.description());
    }
}
