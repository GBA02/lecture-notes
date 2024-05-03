package week9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws java.sql.SQLException{
        String url = "jdbc:sqlite:hello.sqlite";
        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();

//        String createTableSQL = "CREATE TABLE cats (name TEXT, age INTEGER)";
//
//        statement.execute(createTableSQL);
//
//        String insertDateSQL = "INSERT INTO cats VALUES ('Maru', 10)";
//        statement.execute(insertDateSQL);
//
//        String insertDateSQL = "INSERT INTO cats VALUES ('Hello Kitty', 40)";
//        statement.execute(insertDateSQL);

        String getAllDataSQL = "SELECT * FROM cats";

        ResultSet allCats = statement.executeQuery(getAllDataSQL);

        while (allCats.next()){
            String name = allCats.getString("name");
            int age = allCats.getInt("age");
            System.out.println(name + " is " + "years old.");
        }


    }
}
