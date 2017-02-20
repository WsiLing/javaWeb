package com.ruuboo.javademo.socket;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public class ServerSocketTest {
    public static void main(String []args) throws  IOException{
//       创建一个服务端套接字，并且绑定10000端口
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
                System.out.println("有客户端连接到服务器IP:"+ip);
                InputStream is= socket.getInputStream();

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte [] buffer = new byte[1024];
                int len = -1;
                while ((len = is.read(buffer))!= -1){
                    baos.write(buffer,0,len);
                }
                byte [] data = baos.toByteArray();
                String s =  new String(data,0,data.length,"GBK");
                System.out.println(ip + ":"+s);
            }catch (Exception e) {

            }
        }
    }
}
