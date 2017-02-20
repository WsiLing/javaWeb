package com.ruuboo.javademo.jsonpasehttp;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class Jsonpase {
    public static void main(String []args) throws Exception{
        String json = getJson("http://chanyouji.com/api/destinations/plans/55.json?page=1");

        TypeToken<ArrayList<Mydata>> token = new TypeToken<ArrayList<Mydata>>(){

        };
        Gson gson = new Gson();
        ArrayList<Mydata> data = gson.fromJson(json,token.getType());
        for (int i = 0; i <data.size() ; i++) {
            Mydata mydata = data.get(i);
            System.out.println("name:"+mydata.getName());
            System.out.println("description:"+mydata.getDescription());
            System.out.println("ID:"+mydata.getId());
        }

    }

    public static String getJson(String path) throws Exception {
//        1.创建一个url对象：
        URL url = new URL(path);
//        2.通过url获取一个网络连接对象   openConnection()返回一个 URLConnection 对象，它表示到 URL 所引用的远程对象的连接。
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        3.给网络连接设置请求相关属性：
        connection.setRequestMethod("GET");//请求方式
        connection.setConnectTimeout(5000);//超时时间
//        4.连接服务器：
        connection.connect();
//        5.获取服务器返回的状态响应码
        int code = connection.getResponseCode();
//        服务器成功响应了请求：
        if (code == HttpURLConnection.HTTP_OK) {
//  获取服务器返回的响应头包含的数据：
            String type = connection.getContentType();
            String charset = type.substring(type.lastIndexOf("=") + 1);
//  获取服务器返回的输入流
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            InputStream is = connection.getInputStream();
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            String json = baos.toString(charset);
            return json;
        }else {
            return null ;
        }
    }

}

