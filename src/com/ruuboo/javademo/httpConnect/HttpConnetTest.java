package com.ruuboo.javademo.httpConnect;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public class HttpConnetTest {
    public static void main (String []args)throws IOException{
//        1.创建一个url对象：
        URL url = new URL("http://chanyouji.com/api/destinations.json?page=1");
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
            String charset = type.substring(type.lastIndexOf("=")+1);
            System.out.println("charset:"+charset);
//  获取服务器返回的输入流
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            InputStream is = connection.getInputStream();
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = is.read(buffer))!= -1){
                baos.write(buffer,0,len);
            }
            String json = baos.toString(charset);
            System.out.println(json);
        }

    }
}
