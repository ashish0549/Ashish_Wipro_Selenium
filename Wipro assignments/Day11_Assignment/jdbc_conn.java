package Day_11_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_conn {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String url="jdbc:mysql://localhost:3306/db";
	String user="root";
	String password="root";
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con= DriverManager.getConnection(url,user,password);
	System.out.println("Sucessfully Connected");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("Select * from emp");
	System.out.println("id\t name\t salary\t age");
	
	while (rs.next()) {
		int id=rs.getInt("id");
		String name=rs.getString("name");
		int salary =rs.getInt("salary");
		int age=rs.getInt("age");
		System.out.println(id+"  "+name+"  "+salary+"  "+age);
		
	}
	rs.close();
	stmt.close();
	con.close();
}
}
