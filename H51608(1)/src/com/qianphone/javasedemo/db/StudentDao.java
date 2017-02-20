package com.qianphone.javasedemo.db;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Admin on 2017/1/6.
 */
public class StudentDao {

    private Connection connection;

    public StudentDao() {
        connection = DBConnectionUtils.getConnection();
    }

    public void update(Student stu) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE student set name = ?,age = ? where id = ?");
            statement.setString(1, stu.getName());
            statement.setInt(2, stu.getAge());
            statement.setInt(3, stu.getId());

            statement.execute();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteById(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE  FROM student WHERE id = ?");
            statement.setInt(1, id);
            statement.execute();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    /**
     * 向学生表中插入一条数据
     *
     * @param studnet
     */
    public void insert(Student studnet) {
        try {
//            Statement statement = connection.createStatement();
            PreparedStatement statement = connection.prepareStatement("INSERT  INTO student(name,age) VALUES (?,?)");
            //给占位符设置值
            statement.setString(1, studnet.getName());
            statement.setInt(2, studnet.getAge());

            //真正执行sql语句
            statement.execute();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    /**
     * 获取学生表中的所有数据
     *
     * @return
     * @throws SQLException
     */
    public ArrayList<Student> getAllStudent() throws SQLException {
        ArrayList<Student> students = new ArrayList<Student>();
        PreparedStatement statement = connection.prepareStatement("SELECT  * FROM student");

        ResultSet resultSet = statement.executeQuery();
        //移动结果集的指针
        while (resultSet.next()) {
            //获取每一列的值
            int id = resultSet.getInt("id");
            int age = resultSet.getInt("age");
            String name = resultSet.getString("name");
//            System.out.println(" id = " + id + "  age = " + age + "  name = " + name);
            //把获取到的数据封装到对象中
            Student student = new Student(id, name, age);
            //把对象存到集合中
            students.add(student);
        }

        return students;
    }
}
