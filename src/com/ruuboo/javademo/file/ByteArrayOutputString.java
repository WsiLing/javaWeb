package com.ruuboo.javademo.file;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
//ByteArrayOutputStream;此类实现了一个输出流，其中的数据被写入一个 byte 数组。缓冲区会随着数据的不断写入而自动增长。
public class ByteArrayOutputString {
    public static void main(String []args) throws Exception{
        readTexRight();
    }

    private static void readTexRight() throws IOException{
//        File files = new File("D:\\");
//  创建一个 byte 数组输出流，用来积攒数据 对文本进行转码
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//       FileInputStream:  从文件系统中的某个文件中获得输入字节
        FileInputStream fis = new FileInputStream("D:\\");
        byte [] info = new byte[1023];
        int len = -1;
        while((len = fis.read(info))!= -1){
            baos.write(info,0,len);//将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此 byte 数组输出流。

        }
        byte [] data = baos.toByteArray();//创建一个新分配的 byte 数组。其大小是此输出流的当前大小，并且缓冲区的有效内容已复制到该数组中。
        String s = new String(data,0,data.length,"GBK");// 通过使用指定的 charset 解码指定的 byte 子数组，构造一个新的 String。
        System.out.println(s);

    }
    //这种方式边读边转码，可能会出现乱码
    private static void readTexError() throws IOException{
        FileInputStream fio = new FileInputStream("D:\\");
        byte [] infos = new byte[1023];
        int len = -1;
        String r = new String();
        while ((len = fio.read(infos))!=-1) {
            String tString =new String(infos,0,len,"GBK");
            r+=tString;
        }
        System.out.println(r);
    }




}
