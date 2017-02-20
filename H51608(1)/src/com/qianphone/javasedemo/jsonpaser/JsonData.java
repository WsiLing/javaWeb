package com.qianphone.javasedemo.jsonpaser;


import java.util.ArrayList;

/**
 * Created by Admin on 2017/1/6.
 */
public class JsonData {

    private ArrayList<User> datas;
    private Status status;

    public JsonData(ArrayList<User> datas, Status status) {
        this.datas = datas;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public JsonData() {
    }


    public ArrayList<User> getDatas() {
        return datas;
    }

    public void setDatas(ArrayList<User> datas) {
        this.datas = datas;
    }
}
