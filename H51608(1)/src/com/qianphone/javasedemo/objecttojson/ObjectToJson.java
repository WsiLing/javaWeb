package com.qianphone.javasedemo.objecttojson;

import com.google.gson.Gson;
import com.qianphone.javasedemo.jsonpaser.User;
import com.qianphone.javasedemo.jsonpractice.Student;

import java.util.ArrayList;

/**
 * Created by Admin on 2017/1/6.
 */
public class ObjectToJson {

    public static void main(String[] args) {
        //把对象转换成Json字符串
        Gson gson = new Gson();

        ArrayList<User> students = new ArrayList<User>();
        for (int i = 0; i < 100; i++) {
            User user = new User("张三" + i, i);
            students.add(user);
        }
        String json = gson.toJson(students);
        System.out.println(json);
    }
}
