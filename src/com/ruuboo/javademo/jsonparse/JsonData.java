package com.ruuboo.javademo.jsonparse;
import java.util.ArrayList;
/**
 * Created by Administrator on 2017/1/6 0006.
 */

public class JsonData {

    private Status status;
    private ArrayList<User> datas;


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
