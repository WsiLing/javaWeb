package com.qianphone.javasedemo.collection;

/**
 * Created by Admin on 2017/1/4.
 */
public class User {

    private int id;
    private String name;
    private float money;

    public User(int id, String name, float money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
