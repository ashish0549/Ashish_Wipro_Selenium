package Day_11_Assignment;
import java.sql.*;
public class employeee {
public static void main(String[] args) throws SQLException {
	String url="jdbc:mysql://localhost:3306/db";
	String username="root";
	String password="root";
	
	
	Connection con=DriverManager.getConnection(url,username,password);
	
	CallableStatement cst=con.prepareCall("{Call samename()}");
	CallableStatement cst1=con.prepareCall("{Call descending()}");
	
	ResultSet rs=cst.executeQuery();
	ResultSet rs1=cst1.executeQuery();
	
	System.out.println("ID\tName\t\t\tSalary");
    System.out.println("------------------------------------");

    while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int salary = rs.getInt("salary");

        System.out.printf("%d\t%-20s\t%d\n", id, name, salary);
    }
    
    System.out.println("Ascendiing order");
    System.out.println("ID\tName\t\t\tSalary");
    System.out.println("------------------------------------");

    while (rs1.next()) {
        int id = rs1.getInt("id");
        String name = rs1.getString("name");
        int salary = rs1.getInt("salary");

        System.out.printf("%d\t%-20s\t%d\n", id, name, salary);
    }
    rs.close();
    rs1.close();
}
}
