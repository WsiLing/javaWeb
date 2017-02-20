package com.qianphone.javasedemo.db;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 连接数据库的工具类
 */
public class DBConnectionUtils {
    //加载数据库驱动
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static final String uri = "jdbc:mysql://127.0.0.1:3306/students";
    private static final String username = "root";
    private static final String password = "root";

    /**
     * 获取数据库的连接对象
     *
     * @return
     */
    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(uri, username, password);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
