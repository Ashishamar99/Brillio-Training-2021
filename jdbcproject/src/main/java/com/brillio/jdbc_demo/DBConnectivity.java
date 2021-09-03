package com.brillio.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectivity {
    public static Connection connection = null;

    public static Connection getConnection() throws Exception {
        if (connection == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
        }
        return connection;
    }


}