package edu.vkv.jdbc;

/**
 * Created by admin on 31.08.14.
 */
public class Main {
    public static void main(String[] args) {
        LessonsConnector connector = new LessonsConnector();
        System.out.println("JDBC Lesson 0003");
        System.out.println(connector.getAllLessons());
    }
}
