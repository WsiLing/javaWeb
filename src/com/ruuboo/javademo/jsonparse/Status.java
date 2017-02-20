package com.ruuboo.javademo.jsonparse;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class Status {
    private int code;
    private int status;

    public Status() {
    }
    public Status(int code,int status){
        this.code = code;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
