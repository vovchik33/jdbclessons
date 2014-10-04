package edu.vkv.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 31.08.14.
 */
public class LessonsConnector {

    public List getAllLessons() {
        List list=new ArrayList();
        String query="SELECT * FROM lesson";
        Connection connection=DBManager.getConnection();
        try {
            Statement statement=connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                list.add(rs.getString("TOPIC"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
