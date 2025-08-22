package JDBC_conn;

import java.sql.*;

public class HospitalProcedureCaller {

    static final String url = "jdbc:mysql://localhost:3306/mydb";
    static final String username = "root";
    static final String password = "root";

    public static void main(String[] args) {
        callAvgPatientsPerDay();
        callSameWardPatients();
        callPatientsByAdmission();
    }

 
    public static void callAvgPatientsPerDay() {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             CallableStatement stmt = conn.prepareCall("{CALL avg_patients_per_day()}")) {

            ResultSet rs = stmt.executeQuery();
            System.out.println("Average Patients Per Day:");
            if (rs.next()) {
                double avg = rs.getDouble("average_patients_per_day");
                System.out.println("Average: " + avg);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
    public static void callSameWardPatients() {
        try (Connection conn = DriverManager.getConnection(url,username,password);
             CallableStatement stmt = conn.prepareCall("{CALL same_ward_patients()}")) {

            ResultSet rs = stmt.executeQuery();
            System.out.println("\nPatients in Same Ward:");
            while (rs.next()) {
                String ward = rs.getString("ward_name");
                String name = rs.getString("patient_name");
                System.out.println("Ward: " + ward + " | Name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public static void callPatientsByAdmission() {
        try (Connection conn = DriverManager.getConnection(url,username, password);
             CallableStatement stmt = conn.prepareCall("{CALL patients_by_admission()}")) {

            ResultSet rs = stmt.executeQuery();
            System.out.println("\nPatients Ordered by Admission Date:");
            while (rs.next()) {
                int id = rs.getInt("patient_id");
                String name = rs.getString("patient_name");
                String ward = rs.getString("ward_name");
                Date date = rs.getDate("admission_date");
                System.out.println("ID: " + id + ", Name: " + name + ", Ward: " + ward + ", Date: " + date);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}