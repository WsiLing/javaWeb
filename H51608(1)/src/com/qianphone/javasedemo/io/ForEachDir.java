package com.qianphone.javasedemo.io;

import java.io.File;

/**
 * Created by Admin on 2017/1/4.
 */
public class ForEachDir {

    public static void main(String [] args){
        ForEachDir forEachDir = new ForEachDir();

        File dir = new File("E:\\");

        forEachDir.scanDir(dir);
    }

    public void scanDir(File dir){
        //1.获取到这个目录中所有的子文件及子文件夹
        File [] files = dir.listFiles();
        if(files == null){//如果目录是空的，就没有必要进行遍历了
            return;
        }
        //2.对文件数组进行遍历
        for (int i = 0; i <files.length ; i++) {
            File f = files[i];
            if(f.isFile()){//说明是文件，直接输出该文件的名字
                System.out.println(f.getName());
            }else{//说明是目录
                //递归调用本方法
                System.out.println("文件夹 --> "+f.getName());
                scanDir(f);
            }
        }

    }
}
