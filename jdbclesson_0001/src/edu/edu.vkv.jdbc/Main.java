import java.sql.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("JDBC Lesson 0001");

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("MySQL Driver not found!!!");
        }

        Connection connection;
        Statement statement;
        String selectAllSql = "SELECT * FROM lesson";

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_lessons", "jdbc_lessons", "jdbc_lessons");
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectAllSql);
            while(rs.next()) {
                System.out.println(rs.getString("ID"));
                System.out.println(rs.getString("TOPIC"));
                System.out.println(rs.getString("DESCRIPTION"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
