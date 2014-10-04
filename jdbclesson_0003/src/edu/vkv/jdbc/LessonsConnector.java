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
        List result = new ArrayList();
        String query="SELECT * FROM lesson";
        Connection connection = DBManager.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Lesson lesson = new Lesson();
                lesson.setId(rs.getInt("ID"));
                lesson.setTopic(rs.getString("TOPIC"));
                lesson.setDescription(rs.getString("DESCRIPTION"));
                result.add(lesson);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
