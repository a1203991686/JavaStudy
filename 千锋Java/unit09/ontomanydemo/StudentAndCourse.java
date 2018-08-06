package com.unit09.ontomanydemo;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 16:59
 */
public class StudentAndCourse {
    private int id;
    private int sid;
    private int cid;

    public StudentAndCourse(int id, int sid, int cid) {
        this.id = id;
        this.sid = sid;
        this.cid = cid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
