package com.unit09.ontomanydemo;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 16:58
 */
public class Course {
    private String name;
    private int cid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Course(String name, int cid) {
        this.name = name;
        this.cid = cid;
    }
}
