package com.ruuboo.javademo.httpConnect;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public class HttpConnetImage {
    public static void main(String []args)throws Exception{
        URL url = new URL("http://a4.att.hudong.com/38/47/19300001391844134804474917734_950.png" );
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(3000);

        httpURLConnection.connect();

        int code = httpURLConnection.getResponseCode();
        if(code==httpURLConnection.HTTP_OK){
            InputStream is = httpURLConnection.getInputStream();
            File file = new File("D:\\tupian.jpg");
            FileOutputStream fos = new FileOutputStream(file);
            byte [] buffer = new byte[1024];
            int len = -1;
            while ((len = is.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
            is.close();
            fos.close();
        }
    }
}
