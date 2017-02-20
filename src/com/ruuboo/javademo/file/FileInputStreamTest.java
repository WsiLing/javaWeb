package com.ruuboo.javademo.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Administrator on 2017/1/4 0004.
 */
public class FileInputStreamTest {
    public static void main(String []args) throws Exception{
        readTextFile();

    }
    private static void readTextFile() throws Exception{
        File f = new File("D:\\test.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("总长度："+fis.available());

        //创建数组:
        byte [] buffer = new byte[2048];
        int len = -1;
        String s = new String();
        while ((len=fis.read(buffer)) != -1){
            String curString = new String(buffer,0,len,"GBK");
            s += curString;
            System.out.println("本次读取了"+len+"个数据存到缓存数组中");

        }
        fis.close();//结束后关闭流
        System.out.println("内容："+s);
    }
}

