package com.qianphone.javasedemo.jsonpractice;

import java.util.ArrayList;

/**
 * Created by Admin on 2017/1/6.
 */
public class MyClass {

    private String classRoom;

    private String className;

    private ArrayList<Student> students;

    public MyClass() {
    }

    public MyClass(String classRoom, String className, ArrayList<Student> students) {
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
