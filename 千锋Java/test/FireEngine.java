package com.test;

import java.io.Serializable;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/08 14:51.
 */
public class FireEngine implements Serializable {
    int ID;    //消防车编号
    int distance;   //喷水距离
    public void setID(int ID){
        this.ID=ID;
    }
    public void setDistance(int distance){
        this.distance=distance;
    }



    @Override
    public String toString() {
        return "FireEngine{" +
                "ID=" + ID +
                ", distance=" + distance +
                '}';
    }
}
