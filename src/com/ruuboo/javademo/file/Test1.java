package com.ruuboo.javademo.file;
import java.io.File;
/**
 * Created by Administrator on 2017/1/4 0004.
 */
public class Test1 {
    public static void main(String[] args) {
//        String path="D:\\New\\javaWeb\\jietu";
        File file=new File("D:\\New\\javaWeb\\jietu");
        File[] tempList = file.listFiles();
        System.out.println("该目录下对象个数："+tempList.length);
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                System.out.println("文     件："+tempList[i]);
            }
            if (tempList[i].isDirectory()) {
                System.out.println("文件夹："+tempList[i]);
            }
        }
    }
}
