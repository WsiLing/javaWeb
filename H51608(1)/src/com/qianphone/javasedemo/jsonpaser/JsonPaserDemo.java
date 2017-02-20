package com.qianphone.javasedemo.jsonpaser;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Admin on 2017/1/6.
 */
public class JsonPaserDemo {

    public static void main(String[] args) throws Exception {
        //通过类加载器打开在src目录下的资源文件
        InputStream fis = JsonPaserDemo.class.getClassLoader().getResourceAsStream("simplejson.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len = -1;
        byte[] buffer = new byte[1024];
        while ((len = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, len);
        }

        String json = baos.toString("utf-8");
//        System.out.println(json);

        //使用Gson对Json字符串进行解析
        //1.创建Gson对象
        Gson gson = new Gson();
        //2.把json字符串传入gson对象中
        JsonData jsonData = gson.fromJson(json, JsonData.class);

        Status status = jsonData.getStatus();
        System.out.println("error = " + status.getError() + "  code = " + status.getCode());

        ArrayList<User> users = jsonData.getDatas();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            System.out.println(user.getName() + "-----" + user.getAge());
        }
    }

}
