package com.ruuboo.javademo.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public class MyhttpServer {
    public static void main(String []args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(3344);

        while (true) {
            System.out.println("服务器已启动");

            Socket socket = serverSocket.accept();

            OutputStream os = socket.getOutputStream();
            byte [] data = "这是服务器发出的内容".getBytes("utf-8");


            os.write(data);
            os.flush();
            socket.shutdownInput();
        }
    }
}
