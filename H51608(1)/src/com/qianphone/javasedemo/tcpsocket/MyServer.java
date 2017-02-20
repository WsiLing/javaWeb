package com.qianphone.javasedemo.tcpsocket;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Admin on 2017/1/5.
 */
public class MyServer {
    public static void main(String[] args) throws IOException {
        //创建一个服务端套接字，并且绑定10000端口
        ServerSocket serverSocket = new ServerSocket(10000);
        while (true) {
            System.out.println("服务器已启动，等待客户端连接");
            //让服务端套接字等待客户端的连接。accept方法在有客户端连接之前，一直处于阻塞状态。
            Socket socket = serverSocket.accept();
            //每次有客户端连接，就启动一个线程来进行处理
            new MyWorkerThread(socket).start();
        }
    }

    static class MyWorkerThread extends Thread {

        private Socket socket;

        public MyWorkerThread(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                String ip = socket.getInetAddress().getHostAddress();
                System.out.println("有客户端连接到服务器 IP: " + ip);
                //服务端获取输入流，客户端传输的数据，都可以通过这个输入流来获取
                InputStream is = socket.getInputStream();

                String s = StreamUtils.readStreamToString(is);
                System.out.println(ip + "：" + s);

                //获取socket的输出流，给客户端发送信息
                OutputStream os = socket.getOutputStream();
                os.write("服务器已收到数据".getBytes("utf-8"));
                //标记输出动作完毕
                socket.shutdownOutput();
            } catch (Exception e) {

            }
        }
    }
}
