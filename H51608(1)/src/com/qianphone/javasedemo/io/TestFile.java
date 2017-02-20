package com.qianphone.javasedemo.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by Admin on 2017/1/4.
 */
public class TestFile {

    public static void main(String[] args) throws IOException {
//        testFile();
        testDir();
    }

    private static void testDir() {
        File dir = new File("E:\\Test");

        if(!dir.exists()){//如果文件夹不存在，则创建这个目录
            dir.mkdir();
        }

        //获取目录下的所有文件和文件夹的名字
//       String [] names =  dir.list();
//        for (int i = 0; i < names.length ; i++) {
//            System.out.println(names[i]);
//        }
        //以文件对象的形式获取目录下的所有文件和文件夹
        File [] files = dir.listFiles();
        for (int i = 0; i <files.length ; i++) {
            File f = files[i];
            f.delete();
        }
        dir.delete();
    }

    private static void testFile() throws IOException {
        //1.创建File类的实例
        File file = new File("E:\\H51608\\day1.rar");

        if (!file.exists()) {//如果文件不存在，则创建文件
            file.createNewFile();
        }

        System.out.println("文件长度:" + file.length());

        System.out.println("文件名: " + file.getName());

        System.out.println(file.getTotalSpace());

        System.out.println("分区可用大小：" + file.getUsableSpace());

        //删除文件
        file.delete();
    }

}
