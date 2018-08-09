package com.unit11.No08_Mina;

import java.io.Serializable;

/**
 * Created by littlecorgi_a1203991686 on 2018/08/09 12:15.
 */
public class Message implements Serializable {

    private String from;
    private String to;
    private String type;
    private String info;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", type='" + type + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
