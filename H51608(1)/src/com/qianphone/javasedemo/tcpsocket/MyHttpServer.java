package com.qianphone.javasedemo.tcpsocket;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Admin on 2017/1/5.
 */
public class MyHttpServer {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);

        while (true) {
            System.out.println("服务器已启动");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            FileInputStream fis = new FileInputStream("E:\\Test.html");
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }

            byte[] data = baos.toByteArray();
            fis.close();
            baos.close();

            Socket socket = serverSocket.accept();

            OutputStream os = socket.getOutputStream();

            os.write(data);

//            byte[] data = "这是服务器发出的响应内容".getBytes("utf-8");
//            os.write("Content-Type:text/html;charset=utf-8".getBytes("utf-8"));
//            os.write("Connection:keep-alive".getBytes("utf-8"));
//            os.write("Content-Encoding:gzip".getBytes("utf-8"));
//            os.write(("Content-Length:" + data.length).getBytes("utf-8"));
//            os.write(data);


            os.flush();

            socket.shutdownOutput();

        }
    }
}
