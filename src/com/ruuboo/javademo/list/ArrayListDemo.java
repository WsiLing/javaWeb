package com.ruuboo.javademo.list;

import java.util.ArrayList;
/**
 * Created by Administrator on 2017/1/4 0004.
 */
public class ArrayListDemo {
    public static void main(String []args){
//      ArrayList<String> list = new ArrayList<String>();在<>里可以规定集合放什么类型的数据
        ArrayList list = new ArrayList();
        list.add(100);
        list.add("张三");
        list.add(100.2);
//
//        System.out.println(list.get(3));会报错，因为没有下标为3的数据
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
