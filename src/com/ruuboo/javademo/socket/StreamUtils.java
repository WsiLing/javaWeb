package com.ruuboo.javademo.socket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public class StreamUtils {
    public static String readStreamToString(InputStream is) throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte [] buffer = new byte[1024];
        int len = -1;
        while ((len = is.read(buffer))!= -1){
            baos.write(buffer,0,len);
        }
        return baos.toString("utf-8");
    }

}
