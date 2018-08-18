package com.littlecorgi.onetoone;

import java.io.Serializable;

/**
 * @author littlecorgi
 * @email a1203991686@126.com
 * @date 2018/08/14
 */
public class Message implements Serializable {
    /**
     * to 消息接收对象
     * from 消息发送对象
     * info 消息内容
     * type 消息类型
     */
    private String to;
    private String from;
    private String info;
    private int type;

    public Message(String to, String from, String info, int type) {
        this.to = to;
        this.from = from;
        this.info = info;
        this.type = type;
    }

    public Message() {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
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
