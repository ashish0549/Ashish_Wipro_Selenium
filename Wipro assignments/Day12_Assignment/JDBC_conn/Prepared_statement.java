package JDBC_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

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

public class Prepared_statement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password); 
        System.out.println("Connection created");

        String query = "INSERT INTO student1 (rollno, name, age) VALUES (?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query);
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Nasir Hussain", 22));
        students.add(new Student(102, "Suhas", 22));
        students.add(new Student(103, "Sharath", 23));
        for (Student s : students) {
            pst.setInt(1, s.rollno);
            pst.setString(2, s.name);
            pst.setInt(3, s.age);
            
            int rows = pst.executeUpdate();
            System.out.println(rows + " = Updated rows for rollno: " + s.rollno);
           
        }
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student1");

        while (rs.next()) {
            int rollno = rs.getInt("rollno");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println(rollno + " - " + name +" - "+age);
        }

        rs.close();
        st.close();
        con.close();
        pst.close();
        con.close();
    }
}
