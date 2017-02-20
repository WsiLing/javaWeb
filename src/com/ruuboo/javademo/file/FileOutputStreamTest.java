package com.ruuboo.javademo.file;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public class FileOutputStreamTest  {
    public static void main(String []args) throws Exception{
        File file = new File("D:\\data.txt");

        FileOutputStream fos = new FileOutputStream(file,true);
        String info = "这是我写入的程序 +3";
        byte [] data = info.getBytes("utf-8");
        fos.write(data);
        fos.close();
    }
}
