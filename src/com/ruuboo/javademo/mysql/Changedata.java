package com.ruuboo.javademo.mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class Changedata {
    private Connection connection;
    public Changedata (){
        connection = DataConnetion.getConnection();
    }

//  获取所有数据：
    public ArrayList<Student> getdata()throws SQLException{
        ArrayList<Student> students = new ArrayList<Student>();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM student");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            int age = resultSet.getInt("age");
            String name = resultSet.getString("name");
            Student student = new Student(id,age,name);
            students.add(student);

        }
        return students;
    }
//    插入数据：
    public void insert(Student student)throws SQLException{
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO student(name,age) VALUE (?,?)");
            //给占位符设置值
            statement.setString(1,student.getName());
            statement.setInt(2,student.getAge());
//            执行sql语句；
            statement.execute();
            statement.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
//    删除data
    public void delete(int id) throws SQLException{
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM student WHERE id =?");
            statement.setInt(1,id);
            statement.execute();
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
//    更改数据：

    public void update(Student student)throws SQLException{
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE student set name=?,age=? WHERE id=?");
            statement.setString(1,student.getName());
            statement.setInt(2,student.getAge());
            statement.setInt(3,student.getId());
            statement.execute();
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();

        }
    }
}
