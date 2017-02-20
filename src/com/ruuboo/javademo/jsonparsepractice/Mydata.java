package com.ruuboo.javademo.jsonparsepractice;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class Mydata {
    private String classRoom;
    private String className;
    private ArrayList<Students> students;

    public Mydata() {
    }

    public Mydata(String classRoom, String className, ArrayList<Students> students) {
        this.classRoom = classRoom;
        this.className = className;
        this.students = students;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }
}
