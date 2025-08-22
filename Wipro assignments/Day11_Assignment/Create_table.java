package Day_11_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Create_table {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String url="jdbc:mysql://localhost:3306/db";
	String user="root";
	String password="root";

	String sql="Create table  Student(rollno int,name varchar(50),per int,email varchar(50))";
	
	String insertsql="insert into Student value(101,'Nasir',93,'nasirhussain@gmail.com'),(102,'Ramesh',97,'Ramesh@gmail.com'),(103,'suhas',92,'suhas@gmail.com'),(104,'Rama',86,'Rama@gmail.com'),(105,'sharath',96,'sharath@gmail.com')";
	String updatesql="update Student set per=90 where rollno = 102";
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,user,password);
	System.out.println("Connection Created");
	Statement stmt=con.createStatement();
	
	
	
	stmt.executeUpdate(sql);//to change data in sql
	System.out.println("Student table created");
	
	
	
	int rowInserted=stmt.executeUpdate(insertsql);
	if(rowInserted>0) {
		System.out.println("new Student record inserted");
	}
	
	
	int updatedone=stmt.executeUpdate(updatesql);
	if(updatedone>0) {
		System.out.println("Update is done");
		
	}
	ResultSet rs=stmt.executeQuery("select * from Student");
	System.out.println("rollno\t name\t per\t Email");
	while (rs.next()) {
		int rollno=rs.getInt("rollno");
		String name=rs.getString("name");
		int per =rs.getInt("per");
		String email=rs.getString("email");
		System.out.println(rollno+"  "+name+"  "+per+"  "+email);
		
	}
	
	System.out.println("\n");
	//max percentage
	String max="select max(per) from Student";
	ResultSet rs1=stmt.executeQuery(max);
	if (rs1.next()) {
		int maxvalue=rs1.getInt(1);
	System.out.println("Max percentage is "+ maxvalue);
	}
	System.out.println("\n");
	
	//ascending order
	String asc="select * from student order by per asc";
	ResultSet rasc=stmt.executeQuery(asc);
	System.out.println("ascending order");
	System.out.println("rollno\t name\t per\t Email");
	while (rasc.next()) {
		int rollno = rasc.getInt("rollno");
	    String name = rasc.getString("name");
	    int per = rasc.getInt("per");
	    String email = rasc.getString("email");
	    System.out.println(rollno + "  " + name + "  " + per + "  " + email);
	}
	
	System.out.println("\n");
	//add city
	
	String altr= "alter table Student add city varchar(50)";
	String update1="update Student set city='hyd' where rollno = 101";
	String update2="update Student set city='blr' where rollno = 102";
	String update3="update Student set city='blr' where rollno = 103";
	String update4="update Student set city='blr' where rollno = 104";
	String update5="update Student set city='blr' where rollno = 105";
	
	stmt.executeUpdate(altr);
	System.out.println("city added");
	
	stmt.executeUpdate(update1);
	stmt.executeUpdate(update2);
	stmt.executeUpdate(update3);
	stmt.executeUpdate(update4);
	stmt.executeUpdate(update5);
	System.out.println("update done");
	ResultSet rs4=stmt.executeQuery("select * from Student");
	System.out.println("rollno\t name\t per\t Email\t city");
	while (rs4.next()) {
		int rollno=rs4.getInt("rollno");
		String name=rs4.getString("name");
		int per =rs4.getInt("per");
		String email=rs4.getString("email");
		String city=rs4.getString("city");
		System.out.println(rollno+"  "+name+"  "+per+"  "+email+"  "+city);
		
	}
	
	
	System.out.println("\n");
	String samecity="select * from Student where city ='hyd'";
	ResultSet rs5 = stmt.executeQuery(samecity);
	System.out.println("rollno\t name\t per\t Email\t city");
	while (rs5.next()) {
		int rollno=rs5.getInt("rollno");
		String name=rs5.getString("name");
		float per =rs5.getInt("per");
		String email=rs5.getString("email");
		String city=rs5.getString("city");
		System.out.println(rollno+"  "+name+"  "+per+"  "+email+"  "+city);
		
	}
	
	
	
	String moddata="alter table Student modify column per float";
	stmt.executeUpdate(moddata);
	System.out.println("Column per is modified to float");
	String upd1="update Student set per=95.0 where rollno = 101";
	String upd2="update Student set per=96.0 where rollno = 102";
	
	stmt.executeUpdate(upd1);
	stmt.executeUpdate(upd2);
	
	ResultSet rs6=stmt.executeQuery("select * from Student");
	System.out.println("rollno\t name\t per\t Email\t city");
	while (rs6.next()) {
		int rollno=rs6.getInt("rollno");
		String name=rs6.getString("name");
		int per =rs6.getInt("per");
		String email=rs6.getString("email");
		String city=rs6.getString("city");
		System.out.println(rollno+"  "+name+"  "+per+"  "+email+"  "+city);
		
	}
	

	
	String rename="rename table Student to Studentsss ";
	stmt.executeUpdate(rename);
	System.out.println("rename done sucessfully");
	
	
	String del="alter table Studentsss drop column city";
	stmt.executeUpdate(del);
	System.out.println("deleted sucessfully");
	
	
	
	String deleteRow = "DELETE FROM Studentsss WHERE rollno = 102";
	int rowsDeleted = stmt.executeUpdate(deleteRow);
	System.out.println("Student with rollno 102 deleted successfully.");
	
	
	
	String trunc="truncate table Studentsss";
	stmt.executeUpdate(trunc);
	System.out.println("all records deleted");
	

	
	String dropta="drop table Studentsss";
	stmt.executeUpdate(dropta);
	System.out.println("table deleted");
	
	
	stmt.close();
	con.close();
	rs.close();
}
}
	

