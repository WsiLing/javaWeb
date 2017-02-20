package com.qianphone.javasedemo.jsonpractice;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.qianphone.javasedemo.jsonpaser.JsonPaserDemo;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Admin on 2017/1/6.
 */
public class TestPracticeJson {
    public static void main(String[] args) throws Exception {
        //通过类加载器打开在src目录下的资源文件
        InputStream fis = JsonPaserDemo.class.getClassLoader().getResourceAsStream("practicejson.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len = -1;
        byte[] buffer = new byte[1024];
        while ((len = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, len);
        }

        String json = baos.toString("utf-8");
        Gson gson = new Gson();

        TypeToken<ArrayList<MyClass>> typeToken = new TypeToken<ArrayList<MyClass>>() {
        };

        ArrayList<MyClass> myClasses = gson.fromJson(json, typeToken.getType());

//        ArrayList<MyClass> myClasses = practiceJson.getData();
        System.out.println("数据长度:" + myClasses.size());

        for (int i = 0; i < myClasses.size(); i++) {
            MyClass myclass = myClasses.get(i);
            System.out.println(myclass.getClassName());
            System.out.println(myclass.getClassRoom());
            ArrayList<Student> students = myclass.getStudents();
            for (int j = 0; j < students.size(); j++) {
                Student student = students.get(j);
                System.out.println("名字: " + student.getName() + " 年纪 :" + student.getAge() + " 性别: " + student.getSex());
            }
        }

    }
}
