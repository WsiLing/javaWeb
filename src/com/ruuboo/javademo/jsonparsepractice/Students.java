package com.ruuboo.javademo.jsonparsepractice;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class Students {
    private String name;
    private int age;
    private String sex;

    public Students() {
    }

    public Students(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
