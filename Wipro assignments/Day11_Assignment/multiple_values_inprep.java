package Day_11_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.*;
 

class Student {
    int rollno;
    String name;
    int age;
 
    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
 
public class multiple_values_inprep {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db"; 
        String user = "root"; 
        String password = "root"; 
 
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Neeva Sharma", 20));
        students.add(new Student(102, "Reeva Sharma", 20));
        students.add(new Student(103, "Shiva Upadhyay", 20));
        students.add(new Student(104, "Amit Verma", 22));
        students.add(new Student(105, "Sonal Mehta", 19));
 
  
        try (Connection con = DriverManager.getConnection(url, user, password)) {
          
            String insertQuery = "INSERT INTO student (rollno, name, age) VALUES (?, ?, ?)";
            PreparedStatement insertPst = con.prepareStatement(insertQuery);
 
            for (Student s : students) {
                insertPst.setInt(1, s.rollno);
                insertPst.setString(2, s.name);
                insertPst.setInt(3, s.age);
                insertPst.addBatch(); 
            }
 
            int[] result = insertPst.executeBatch(); 
            System.out.println(result.length + " records inserted successfully.\n");
 
      
            String selectQuery = "SELECT * FROM students";
            PreparedStatement selectPst = con.prepareStatement(selectQuery);
            ResultSet rs = selectPst.executeQuery();
 
            System.out.println("ID\tName\t\t\tMarks");
            System.out.println("---------------------------------------------");
            while (rs.next()) {
                int rollno = rs.getInt("rollno");
                String name = rs.getString("name");
                int age = rs.getInt("age");
 
                System.out.printf("%d\t%-20s\t%d\n", rollno, name, age);
            }
 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}