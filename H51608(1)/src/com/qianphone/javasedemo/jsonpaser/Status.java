package com.qianphone.javasedemo.jsonpaser;

/**
 * Created by Admin on 2017/1/6.
 */
public class Status {
    private int code;
    private int error;

    public Status() {
    }

    public Status(int code, int error) {
        this.code = code;
        this.error = error;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
}
