package com.qianphone.javasedemo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Admin on 2017/1/5.
 */
public class FileCopyUtils {

    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:\\小清.jpeg");
        File dstDir = new File("E:\\");
        copyFile(srcFile, dstDir);
    }


    /**
     * @param src    要复制的源文件  E:\\data.txt
     * @param dstDir 复制到的目标路径  D:\\data.txt
     */
    public static void copyFile(File src, File dstDir) throws IOException {
        //1.首先用FileInputStream跟复制的源文件进行关联
        FileInputStream fis = new FileInputStream(src);
        //2.在目标路径下创建一个跟源文件同名的文件
        File dstFile = new File(dstDir, src.getName());
        if (!dstFile.exists()) {
            dstFile.createNewFile();
        }
        //3.用FileOutputStream跟复制到的目标文件进行关联
        FileOutputStream fos = new FileOutputStream(dstFile);

        //获取到源文件中数据的大小
        int totalCount = fis.available();
        //当前已经读取的数据大小
        int curReadCount = 0;
        //创建一个缓冲数组
        byte[] buffer = new byte[1024];
        //用于标记本次读取了多少个字节存到缓冲数组中
        int len = -1;
        //4.从FileInputStream中读取数据

        int count = 0;
        while ((len = fis.read(buffer)) != -1) {

            //将读取到的数据用FileOutputStream写到目标文件中
            fos.write(buffer, 0, len);
            //将内存中的数据刷新到硬盘上
            fos.flush();
            curReadCount += len;
            //计算当前复制的进度
            float progress = curReadCount / (float) totalCount * 100;
            System.out.println("已完成：" + progress + "%");

//            count++;
//            if (count == 30) {
//                fis.read(buffer);
//                count = 0;
//            }
        }

        fis.close();
        fos.close();
    }

}
