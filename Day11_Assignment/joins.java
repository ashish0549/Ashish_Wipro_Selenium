package Day_11_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class joins {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String url="jdbc:mysql://localhost:3306/db";
	String user="root";
	String password="root";

	String sql="Create table  Student(rollno int,name varchar(50),per int,email varchar(50),institute_id INT )";
	
	String insertsql="insert into Student value(101,'Nasir',93,'nasirhussain@gmail.com',1),(102,'Ramesh',96,'Ramesh@gmail.com',2)";
	String instituteSql = "CREATE TABLE Institute (institute_id INT ,institute_name VARCHAR(100))";
	String insertinstitutel="insert into Institute value(1,'IIT HYD'),(2,'IIT Blr')";
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,user,password);
	System.out.println("Connection Created");
	Statement stmt=con.createStatement();
	//create table
	stmt.executeUpdate(sql);//to change data in sql
	System.out.println("Student table created");
	stmt.executeUpdate(instituteSql);
	System.out.println("Institute table created");
	
	//insert 
	stmt.executeUpdate(insertsql);
	stmt.execute(insertinstitutel);
	
	//innerjoin

	String joinQuery = "SELECT * FROM Student INNER JOIN Institute ON Student.institute_id = Institute.institute_id";

ResultSet rs = stmt.executeQuery(joinQuery);
System.out.println("Inner join");
System.out.println("rollno\t name\t per\t institute");

while (rs.next()) {
int rollno = rs.getInt("rollno");
String name = rs.getString("name");
int per = rs.getInt("per");
String inst = rs.getString("institute_name");

System.out.println(rollno + "\t " + name + "\t " + per + "\t " + inst);

   	// right join
String Rightjoin = "SELECT * FROM Student RIGHT JOIN Institute ON Student.institute_id = Institute.institute_id";

ResultSet rs1 = stmt.executeQuery(Rightjoin);
System.out.println("Right join");
System.out.println("rollno\t name\t per\t institute");

while (rs1.next()) {
  int rollno1 = rs1.getInt("rollno");
 String name1 = rs1.getString("name");
 int per1 = rs1.getInt("per");
 String inst1 = rs1.getString("institute_name");

System.out.println(rollno1 + "\t " + name1 + "\t " + per1 + "\t " + inst1);
}

//left join

String leftjoin = "SELECT * FROM Student LEFT JOIN Institute ON Student.institute_id = Institute.institute_id";

ResultSet rs2 = stmt.executeQuery(leftjoin);
System.out.println("Left Join");
System.out.println("rollno\t name\t per\t institute");

while (rs2.next()) {
int rollno2 = rs2.getInt("rollno");
String name2 = rs2.getString("name");
int per2 = rs2.getInt("per");
String inst2 = rs2.getString("institute_name");

System.out.println(rollno2 + "\t " + name2 + "\t " + per2 + "\t " + inst2);

}
//full join
String fulljoin = "SELECT * FROM Student LEFT JOIN Institute ON Student.institute_id = Institute.institute_id UNION SELECT * FROM Student RIGHT JOIN Institute ON Student.institute_id = Institute.institute_id";

ResultSet rs3 = stmt.executeQuery(fulljoin);
System.out.println("full Join");
System.out.println("rollno\t name\t per\t institute");

while (rs3.next()) {
int rollno3 = rs3.getInt("rollno");
String name3 = rs3.getString("name");
int per3 = rs3.getInt("per");
String inst3 = rs3.getString("institute_name");

System.out.println(rollno3 + "\t " + name3 + "\t " + per3 + "\t " + inst3);



}
}
stmt.close();
con.close();
}
}
