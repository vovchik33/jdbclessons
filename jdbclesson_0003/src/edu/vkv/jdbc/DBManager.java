package edu.vkv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by admin on 31.08.14.
 */
public class DBManager {
    private static final String DB_DRIVER="com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION="jdbc:mysql://localhost:3306/jdbc_lessons";
    private static final String DB_USER="jdbc_lessons";
    private static final String DB_PASS="jdbc_lessons";

    public static Connection getConnection() {
        Connection connection=null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
