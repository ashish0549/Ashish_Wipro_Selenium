package Day_11_Assignment;
import java.sql.*;
 
public class CallableStatement_demo {
	public static void main(String[] args) {
		
	
	String url = "jdbc:mysql://localhost:3306/db";
    String user = "root";
    String password = "root";
 
    try (Connection con = DriverManager.getConnection(url, user, password)) {
        
        CallableStatement cst = con.prepareCall("{CALL getStudentBymark00()}");
        CallableStatement cst2=con.prepareCall("{CALL getStudentOrder()}");
       
     //   cst.setInt(1,87);                
       //cst.setString(2, "Neeva sharma");
 
        
        ResultSet rs = cst.executeQuery();
        ResultSet rs1=cst2.executeQuery();
 
        System.out.println("ID\tName\t\t\tMarks");
        System.out.println("------------------------------------");
 
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int marks = rs.getInt("marks");
 
            System.out.printf("%d\t%-20s\t%d\n", id, name, marks);
        }
        
        
        System.out.println("AScending order");

        System.out.println("ID\tName\t\t\tMarks");
        System.out.println("------------------------------------");
 
        while (rs1.next()) {
            int id = rs1.getInt("id");
            String name = rs1.getString("name");
            int marks = rs1.getInt("marks");
 
            System.out.printf("%d\t%-20s\t%d\n", id, name, marks);
        }
        
        rs.close();
        rs1.close();
 
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}