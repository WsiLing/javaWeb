package com.ruuboo.javademo.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class Mysql {
    public static void main(String []args) throws SQLException{
//        获取数据库连接对象：
        Connection connection = DataConnetion.getConnection();
//        System.out.println("connection:" + connection);
//        获取数据库操作的实例
        Statement statement = connection.createStatement();
//        queryData(statement);
        Changedata changedata = new Changedata();
        changedata.delete(1);
        Student student = new Student(5,20,"jay");
//        changedata.insert(student);
        changedata.update(student);
        changedata.getdata();

        connection.close();
        statement.close();
    }


    private static void queryData(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            int age = resultSet.getInt("age");
            String name = resultSet.getString("name");
            System.out.println( "id:"+id+",age:"+age+",name:"+name);
        }
    }
}
