package com.qianphone.javasedemo.collection;

import java.util.ArrayList;

/**
 * Created by Admin on 2017/1/4.
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        //集合类后面的尖括号中，可以约束集合能放存放的数据类型。
//        ArrayList<Integer> list = new ArrayList<Integer>();
//
//        ArrayList list = new ArrayList();
//        list.add(1000);
//        list.add("张三");
//        list.add(1001.11);
//
//        for (int i = 0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }


        ArrayList<User> users = new ArrayList<User>();
        User zhangsan = new User(1000, "张三", 1001.11f);
        users.add(zhangsan);

        //1.从集合中获取到张三对象
        User user = users.get(0);
        System.out.println("张三的存款: " + user.getMoney());
    }

}
