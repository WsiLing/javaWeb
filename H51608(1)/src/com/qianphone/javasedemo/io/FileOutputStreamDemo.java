package com.qianphone.javasedemo.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Admin on 2017/1/5.
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) throws Exception {
        File file = new File("E:\\data.txt");
        //输出流创建的时候，会自动创建文件,但是不会自动创建目录
        FileOutputStream fos = new FileOutputStream(file,true);

        String info = "这是我用程序写入到硬盘上的数据，是不是很吊啊！+3";
        byte[] data = info.getBytes("utf-8");
        fos.write(data);

        //记得流用完之后，要关闭。
        fos.close();
    }

}
