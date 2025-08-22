package Day_11_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class prepared_statment {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String url="jdbc:mysql://localhost:3306/db";
	String username="root";
	String password="root";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con =DriverManager.getConnection(url,username,password);
	System.out.println("connected Sucessfully");
	
	String query="insert into employee(id,name,salary,age) values(?,?,?,?)";
	PreparedStatement pa=con.prepareStatement(query);
	pa.setInt(1, 1);
	pa.setString(2, "Suhas");
	pa.setInt(3, 25);
	pa.setInt(4, 5650595);
	pa.executeUpdate();
	System.out.println("Inserted Sucessfully");
}
}
