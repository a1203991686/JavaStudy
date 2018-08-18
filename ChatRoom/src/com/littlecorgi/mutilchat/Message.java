package com.littlecorgi.mutilchat;

import java.awt.geom.Rectangle2D;
import java.io.Serializable;

/**
 * @author littlecorgi
 * @email a1203991686@126.com
 * @date 2018/08/14
 */
public class Message implements Serializable {
    private String name;
    private String info;
    private int type;

    public Message(String name, String info, int type) {
        this.name = name;
        this.info = info;
        this.type = type;
    }

    public Message() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
