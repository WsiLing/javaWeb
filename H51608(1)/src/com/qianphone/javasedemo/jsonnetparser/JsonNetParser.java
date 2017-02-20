package com.qianphone.javasedemo.jsonnetparser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Admin on 2017/1/6.
 */
public class JsonNetParser {

    public static void main(String[] args) throws Exception {
//        //通过类加载器打开在src目录下的资源文件
//        InputStream fis = JsonPaserDemo.class.getClassLoader().getResourceAsStream("netjson.txt");
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        int len = -1;
//        byte[] buffer = new byte[1024];
//        while ((len = fis.read(buffer)) != -1) {
//            baos.write(buffer, 0, len);
//        }
//
//        String json = baos.toString("utf-8");
//        System.out.println(json);

        String json = getJsonFromServer("http://chanyouji.com/api/destinations.json?page=1");

        TypeToken<ArrayList<Area>> token = new TypeToken<ArrayList<Area>>() {
        };

        Gson gson = new Gson();
        ArrayList<Area> areas = gson.fromJson(json, token.getType());

        for (int i = 0; i < areas.size(); i++) {
            Area area = areas.get(i);
            int cate = area.getCategory();
            System.out.println("分类: " + cate);
            ArrayList<Country> destinations = area.getDestinations();
            for (int j = 0; j < destinations.size(); j++) {
                Country country = destinations.get(j);
                System.out.println(country.getName_zh_cn());
                System.out.println(country.getImage_url());
            }
        }


    }


    public static String getJsonFromServer(String path) throws Exception {
        //用代码的方式连接服务器获取数据
        //1.创建一个URL对象
        URL url = new URL(path);
        //2.通过URL获取一个网络连接对象
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //3.给网络连接设置请求相关的属性
        //设置请求方式
        connection.setRequestMethod("GET");
        //设置请求的超时时间
        connection.setConnectTimeout(5000);
        //4.连接服务器
        connection.connect();
        //5.获取服务器返回的状态响应码
        int code = connection.getResponseCode();
        if (code == HttpURLConnection.HTTP_OK) {//说明服务器成功地响应了请求

            //获取服务器返回的响应头中包含的字段
            String type = connection.getContentType();
            String charset = type.substring(type.lastIndexOf("=") + 1);
//            System.out.println("charset = " + charset);

            //获取服务器返回的输入流
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            InputStream is = connection.getInputStream();
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            //服务器返回的数据全部读取完毕，再统一转码成字符串
            String json = baos.toString(charset);
            System.out.println(json);
            return json;
        }
        return null;
    }


}



