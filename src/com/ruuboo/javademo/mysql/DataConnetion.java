package com.ruuboo.javademo.mysql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class DataConnetion {
//    加载数据驱动：
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
//   用jdbc 连接本地数据库"jdbc:mysql://127.0.0.1:3306/students";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/students";
    private static final String username = "root";
    private static final String password = "wsl2017";

//    获取数据库连接：
    public static Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            return connection;

        }catch (SQLException e){
            e.printStackTrace();

        }
        return null;
    }
}
