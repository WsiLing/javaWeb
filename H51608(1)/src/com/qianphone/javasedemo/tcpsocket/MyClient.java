package com.qianphone.javasedemo.tcpsocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Admin on 2017/1/5.
 */
public class MyClient {

    public static void main(String[] args) throws IOException {
        //创建客户端套接字对象,指明服务的ip地址和工作端口号
        Socket socket = new Socket("10.16.152.6", 10000);

        //获取客户端的输出流
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("数据来了！！！".getBytes("utf-8"));

        outputStream.flush();
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();

        String info = StreamUtils.readStreamToString(is);
        System.out.println("服务返回的信息:" + info);


    }
}
