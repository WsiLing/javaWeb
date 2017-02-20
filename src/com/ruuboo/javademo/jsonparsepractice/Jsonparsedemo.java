package com.ruuboo.javademo.jsonparsepractice;

import com.google.gson.Gson;
import com.ruuboo.javademo.jsonparse.JsonPaser;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import com.google.gson.reflect.TypeToken;
/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class Jsonparsedemo {
    public static void main(String []args) throws Exception {
        InputStream fis = JsonPaser.class.getClassLoader().getResourceAsStream("com/ruuboo/javademo/practicejson.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len = -1;
        byte[] buffer = new byte[1024];
        while ((len = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, len);
        }
        String json = baos.toString("utf-8");
//        System.out.println(json);

        Gson gson = new Gson();
//        json字符串开头是中括号的处理方式
        TypeToken<ArrayList<Mydata>> typeToken = new TypeToken<ArrayList<Mydata>>() {
        };
//        把数据传进gson中
        ArrayList<Mydata> mydata = gson.fromJson(json,typeToken.getType());

//         对整个数组对象进行遍历：
        for (int i = 0; i < mydata.size(); i++) {

            Mydata mydatas = mydata.get(i);
            System.out.println("className:"+mydatas.getClassName());
            System.out.println("classRoom:"+mydatas.getClassRoom());
            ArrayList<Students> students = mydatas.getStudents();
//            对局部的数组对象遍历：
            for(int j=0;j<students.size();j++){
                Students student = students.get(j);
                System.out.println("sex:"+student.getSex());
                System.out.println("name:"+student.getName());
                System.out.println("age:"+student.getAge());
            }
        }

    }

}
