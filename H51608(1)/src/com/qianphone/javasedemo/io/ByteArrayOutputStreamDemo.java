package com.qianphone.javasedemo.io;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Admin on 2017/1/5.
 */
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws Exception {
//        readTxtError();
        readTxtRight();
    }

    private static void readTxtRight() throws Exception {
        //从E:盘中读取面试题汇总.txt这个文本文档中的数据

        //创建一个内存输出流，用来积攒数据
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //1.创建一个文件输入流对象
        FileInputStream fis = new FileInputStream("E:\\面试题汇总.txt");
        //定义缓冲数组
        byte[] buffer = new byte[1023];
        int len = -1;
        while ((len = fis.read(buffer)) != -1) {
            //把读取到的数据存放到内存输出流的缓冲区
            baos.write(buffer, 0, len);
        }

        //当文本数据全部读取完毕之后，在统一进行转码
        byte[] data = baos.toByteArray();
        String s = new String(data, 0, data.length, "GBK");
        System.out.println(s);

    }

    //这种方式边读边转码，可能会出现乱码
    private static void readTxtError() throws IOException {
        //从E:盘中读取面试题汇总.txt这个文本文档中的数据
        //1.创建一个文件输入流对象
        FileInputStream fis = new FileInputStream("E:\\面试题汇总.txt");
        //定义缓冲数组
        byte[] buffer = new byte[1023];
        int len = -1;
        String s = new String();
        while ((len = fis.read(buffer)) != -1) {
            String tString = new String(buffer, 0, len, "GBK");
            s += tString;
        }
        System.out.println(s);
    }
}
