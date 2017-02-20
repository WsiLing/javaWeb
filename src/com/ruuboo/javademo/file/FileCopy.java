package com.ruuboo.javademo.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Created by Administrator on 2017/1/5 0005.
 */
//文件复制操作：
public class FileCopy {
    public static void main(String []args)throws Exception{
        File filesrc = new File("D:\\data.txt");
        File filedes = new File("D:\\New\\javaWeb\\data.txt");
        copyFile(filesrc,filedes);
    }

    private static void copyFile(File src,File des) throws Exception{
        FileInputStream fis = new FileInputStream(src);
        byte [] buffer = new byte[2048];
        int len = -1;
        String s = new String();
        while ((len = fis.read(buffer))!= -1){
            //限定读取长度，读多少写多少；避免读取空格
            String curString = new String(buffer,0,len,"utf-8");
            s += curString;
        }


        FileOutputStream fio = new FileOutputStream(des,true);
        String info = s;
        byte [] data = info.getBytes("utf-8");
        fio.write(data);

//结束后关闭流
        fis.close();
        fio.close();
    }


}
