package com.ruuboo.javademo.ObjectToJson;
import com.google.gson.Gson;
import com.ruuboo.javademo.jsonparse.User;
/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class ObjToJson {
    public static void main(String []args){
        Gson gson = new Gson();
        User user= new User("张三",10);
//        toJson():对象转换成json字符串
        String json = gson.toJson(user);
        System.out.println(json);


    }
}
