package com.qianphone.javasedemo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Admin on 2017/1/4.
 */
public class FileInputStreamDemo {

    public static void main(String[] args) throws Exception {
//        readTextFileByByte();
        readTextFile();

    }

    private static void readTextFile() throws Exception {
        //目的：把E:根目录下的“面试题汇总.docx”文件中的数据读取到内存中
        //1.创建一个文件输入流对象
        File f = new File("E:\\面试题汇总.txt");
        FileInputStream fis = new FileInputStream(f);

        //定义一个容器，用来做为读取数据的缓冲
        byte[] buffer = new byte[2047];
        //从流中读取数据装到缓冲容器中
        int len = -1;
        String s = new String();
        while ((len = fis.read(buffer)) != -1) {
            String curString = new String(buffer, 0, len, "GBK");
            s = s + curString;
            System.out.println("本次读取了" + len + "个数据存到缓冲数组中");
        }

        System.out.println("内容:" + s);
        //记得流用完之后，要关闭。
        fis.close();
    }

    private static void readTextFileByByte() throws IOException {
        //目的：把E:根目录下的“面试题汇总.docx”文件中的数据读取到内存中
        //1.创建一个文件输入流对象
        File f = new File("E:\\面试题汇总.docx");
        FileInputStream fis = new FileInputStream(f);


        System.out.println("总共的数据长度:" + fis.available());
        int[] storage = new int[fis.available()];
        int index = 0;
        while (true) {
            //从流中读取一个字节
            int data = fis.read();
            if (data == -1) {//读取完毕则跳出循环
                break;
            }
            //把读取到的数据存到数组中
            storage[index] = data;
            index++;
        }
        String s = new String(storage, 0, storage.length);
        System.out.println(s);

        System.out.println("流中剩下的数据长度:" + fis.available());

        //2.通过输入流去读取文件中的数据
    }
}
