package bank.management.system;

import java.sql.*;

public class Conect {
    Connection connection;
    Statement statement;

    public Conect() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankSystem",
                    "your-username",
                    "your-password");
            statement = connection.createStatement();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
