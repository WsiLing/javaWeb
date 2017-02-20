package com.ruuboo.javademo.file;
import java.io.File;
import java.io.IOException;
/**
 * Created by Administrator on 2017/1/4 0004.
 */
public class Test2 {
    public static void main(String []args) throws Exception{
//        testFile();

        testDir();
    }
    public static void testDir() {
        File dir = new File("D:\\New\\javaWeb\\jietu");
        if(!dir.exists()){
            //如果文件夹不存在，则创建这个目录
            dir.mkdir();
        }
        //以文件对象的形式获取目录下的所有文件和文件夹
        File [] files = dir.listFiles();
        for(int i=0;i<files.length;i++){
            File f = files[i];

            f.delete();//遍历该文件夹的内容，然后删掉
        }
        dir.delete();//把该文件夹也删掉
    }

    public static void testFile() throws IOException{
        //实例化File对象：
        File file = new File("D:\\New\\javaWeb\\jietu\\test1");
        if (!file.exists()) {//如果文件不存在，则创建文件
            file.createNewFile();
        }

        System.out.println("文件长度为："+file.length());
        System.out.println("文件名称为："+file.getName());
        System.out.println("分区可用大小为："+file.getUsableSpace());
        System.out.println(file.getTotalSpace());


    }

}
