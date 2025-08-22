package JDBC_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Statement;

public class Create_table {
	public static void main(String[] args) throws ClassNotFoundException , SQLException
	{
		//import packages
		//create object for connection
		//Retrieve data
		//close connection
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create table
		String sql="create table if not exists students(rollno int,"
				+"name varchar(50),"
				+"per int,"
				+"email varchar(50))";
		//insert record
		String insertSQL="insert into students values(101,'Neeva Sharma',98,'Neeva@gmail.com'),"
				+"(102,'Reeva Sharma',89,'Reeva@gmail.com'),"
				+"(103,'Abhishek',93,'Abhishek@gmail.com')";
		String updateSQL="update students set per = 95 where rollno = 102";
		try 
		{
			// driver connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection Created");
			
			// create statement for query using statement
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Students table created");
			
			//call insert query using statement
			int rowInserted=stmt.executeUpdate(insertSQL);
			int rowUpdated=stmt.executeUpdate(updateSQL);
			if(rowInserted>0) 
			{
				System.out.println("new Student record inserted ");
			}
			
			//Print table
			ResultSet rs=stmt.executeQuery("Select * from students");
			System.out.println("rollno\t name\t Percentage\t Email");
			
			//while loop for fetching all the table records
			while(rs.next()) 
			{
				int rollno=rs.getInt("rollno");
				String name=rs.getString("name");
				int per=rs.getInt("per");
				String email=rs.getString("Email");
				System.out.println(rollno+"  |  "+ name+"  |  "+per+"   |   "+email);
			}
			stmt.close();
			con.close();
		}
		catch(SQLException e) 
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		
     }
}
