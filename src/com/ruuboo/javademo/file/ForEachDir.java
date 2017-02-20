package com.ruuboo.javademo.file;
import java.io.File;
/**
 * Created by Administrator on 2017/1/4 0004.
 */
public class ForEachDir {
    public static void main(String []args){
        //实例化对象
        ForEachDir forEachDir = new ForEachDir();
        //路劲
        File dir = new File("D:\\New\\javaWeb\\jietu");
        forEachDir.scanDir(dir);
    }
    //构造方法：
        public void scanDir(File dir) {
            //把遍历的结果放到数组中
            File [] files = dir.listFiles();
            // 先判断文件夹是否为空
            if(files == null){
                return;
            }

//          遍历文件夹：
            for(int i=0;i<files.length;i++){
                File f = files[i];
                //如果是文件，直接输出文件名
                if(f.isFile()){
                    System.out.println("文件："+f.getName());

                    //如果是文件夹，继续遍历
                }else if(f.isDirectory()){
                    System.out.println("文件夹："+f.getName());
                    scanDir(f);//递归的思想，搜索文件夹中子文件夹的文件
                }

            }
        }
    }

