package Day_11_Assignment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class hospital_procedure {
public static void main(String[] args) throws SQLException {
	String url="jdbc:mysql://localhost:3306/db";
	String username="root";
	String password="root";
	
	
	Connection con=DriverManager.getConnection(url,username,password);
	
	CallableStatement cst=con.prepareCall("{Call avg_daily_wages()}");
	CallableStatement cst1=con.prepareCall("{Call same_ward()}");
	CallableStatement cst2=con.prepareCall("{Call ascending_ ()}");
	
	ResultSet rs=cst.executeQuery();
	ResultSet rs1=cst1.executeQuery();
	ResultSet rs2=cst2.executeQuery();
	System.out.println("Average number of patients per day:");
    if (rs.next()) {
        System.out.println(rs.getDouble(1));
    }

	
	
    System.out.println("P_ID\tP_Name\tDaily_wages\tWard_no\tJoining_Date");
    System.out.println("----------------------------------------------------");
    while (rs1.next()) {
        int patient_id = rs1.getInt("patient_id");
        String p_name = rs1.getString("p_name");
        int daily_wages = rs1.getInt("daily_wages");
        int ward_no = rs1.getInt("ward_no");
        String joining_date = rs1.getString("joining_date");

        System.out.printf("%d\t%-10s\t%d\t\t%d\t%s\n", patient_id, p_name, daily_wages, ward_no, joining_date);
    }

    System.out.println("Ascending order");
    System.out.println("P_ID\tP_Name\tDaily_wages\tWard_no\tJoining_Date");
    System.out.println("----------------------------------------------------");
    while (rs2.next()) {
        int patient_id = rs2.getInt("patient_id");
        String p_name = rs2.getString("p_name");
        int daily_wages = rs2.getInt("daily_wages");
        int ward_no = rs2.getInt("ward_no");
        Date joining_date = rs2.getDate("joining_date");
        System.out.printf("%d\t%-10s\t%d\t\t%d\t%s\n", patient_id, p_name, daily_wages, ward_no, joining_date);
    }
}
}
