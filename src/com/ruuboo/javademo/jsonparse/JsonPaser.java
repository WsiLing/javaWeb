package com.ruuboo.javademo.jsonparse;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class JsonPaser {
    public static void main (String []args) throws Exception{
//通过类加载器加载src目录下的txt
        InputStream fis = JsonPaser.class.getClassLoader().getResourceAsStream("com/ruuboo/javademo/json.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len = -1;
        byte [] buffer = new byte[1024];
        while ((len=fis.read(buffer))!= -1){
            baos.write(buffer,0,len);
        }
        String json = baos.toString("utf-8");

//        使用Gson对Json字符串进行解析
//        GSON是一个google提供开源类库，可以实现java对象和json字符串的互相转换
//        1.创建Gson对象
        Gson gson = new Gson();
//        2.把Json对象传进Gson 对象中；
        JsonData jsonData = gson.fromJson(json,JsonData.class);
        Status status = jsonData.getStatus();
        System.out.println("code:"+ status.getCode()+",error:"+status.getStatus());

        ArrayList<User> users = jsonData.getDatas();
        for (int i = 0; i <users.size() ; i++) {
            User user = users.get(i);
            System.out.println("name:"+user.getName()+",age："+user.getAge());
        }


    }
}
