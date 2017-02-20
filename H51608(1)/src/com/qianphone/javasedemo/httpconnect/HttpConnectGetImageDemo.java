package com.qianphone.javasedemo.httpconnect;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Admin on 2017/1/5.
 */
public class HttpConnectGetImageDemo {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://a4.att.hudong.com/38/47/19300001391844134804474917734_950.png");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);

        connection.connect();

        int code = connection.getResponseCode();
        System.out.println("code = " + code);
        if (code == HttpURLConnection.HTTP_OK) {
            InputStream is = connection.getInputStream();
            File file = new File("E:\\小清醒.jpg");
            FileOutputStream fos = new FileOutputStream(file);
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            is.close();
            fos.close();
        }
    }
}
