package Day_11_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/dbb"; 
        String user = "root"; 
        String password = "root"; 

        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to the database successfully!");

            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection has failed.");
            e.printStackTrace();
        }
    }
}
