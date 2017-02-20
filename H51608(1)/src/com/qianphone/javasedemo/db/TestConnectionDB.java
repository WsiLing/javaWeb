package com.qianphone.javasedemo.db;

import com.qianphone.javasedemo.jsonpractice.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Admin on 2017/1/6.
 */
public class TestConnectionDB {
    public static void main(String[] args) throws SQLException {

        //获取数据库连接对象
        Connection connection = DBConnectionUtils.getConnection();
//        System.out.println("connection = " + connection);
        //通过数据库连接对象获取操作数据库的实例
        Statement statement = connection.createStatement();

//        queryData(statement);
//        insertData(statement);

        //通过封装数据访问层的方式来插入数据
        Student student = new Student(2, "张玲", 19);
        StudentDao studentDao = new StudentDao();
//        studentDao.insert(student);
//        studentDao.deleteById(5);
        studentDao.update(student);

//        ArrayList<Student> students = studentDao.getAllStudent();
//        for (int i = 0; i < students.size(); i++) {
//            Student stu = students.get(i);
//            System.out.println(stu.getId() + "--" + stu.getName() + " -- " + stu.getAge());
//        }

        statement.close();
        connection.close();
    }

    private static void insertData(Statement statement) {
        try {
            statement.execute("insert into student (name,age) VALUES ('张三',21)");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //查询数据库中的数据
    private static void queryData(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT  * FROM student");
        //移动结果集的指针
        while (resultSet.next()) {
            //获取每一列的值
            int id = resultSet.getInt("id");
            int age = resultSet.getInt("age");
            String name = resultSet.getString("name");

            System.out.println(" id = " + id + "  age = " + age + "  name = " + name);
        }
    }
}
