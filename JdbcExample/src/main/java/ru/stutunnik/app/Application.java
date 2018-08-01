package ru.stutunnik.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Application {

    public static void main(String[] args) {

        try {
            //String driver = "com.mysql.jdbc.Driver";
            //Class.forName(driver).newInstance();
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/auth_db?serverTimezone=UTC",  // MySql requires serverTimezone to be set in connection url
                    "root",
                    "12345678");

            PreparedStatement preparedStatement = connection.prepareStatement("Select * from Users");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("USERS.user_name"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
