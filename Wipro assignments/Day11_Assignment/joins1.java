package Day_11_Assignment;


import java.sql.*;

public class joins1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/db";
        String user = "root";
        String password = "root";

        String sql = "CREATE TABLE Student(rollno INT, name VARCHAR(50), per INT, email VARCHAR(50), institute_id INT)";
        String insertsql = "INSERT INTO Student VALUES(101,'nasir',95,'nasirhussain@gmail.com',1),(102,'Ramesh',96,'Ramesh@gmail.com',2)";
        String instituteSql = "CREATE TABLE Institute (institute_id INT, institute_name VARCHAR(100))";
        String insertinstitutel = "INSERT INTO Institute VALUES(1,'IIT HYD'),(2,'IIT Blr'),(3,'IIT Chennai')";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection Created");

        Statement stmt = con.createStatement();

     

        stmt.executeUpdate(sql);
        stmt.executeUpdate(instituteSql);
        stmt.executeUpdate(insertsql);
        stmt.executeUpdate(insertinstitutel);

        // INNER JOIN
        System.out.println("Inner join");
        System.out.println("rollno\t name\t per\t institute");
        ResultSet rs = stmt.executeQuery("SELECT * FROM Student INNER JOIN Institute ON Student.institute_id = Institute.institute_id");
        while (rs.next()) {
            System.out.println(rs.getInt("rollno") + "\t " + rs.getString("name") + "\t " + rs.getInt("per") + "\t " + rs.getString("institute_name"));
        }

        // RIGHT JOIN
        System.out.println("\nRight join");
        System.out.println("rollno\t name\t per\t institute");
        ResultSet rs1 = stmt.executeQuery("SELECT * FROM Student RIGHT JOIN Institute ON Student.institute_id = Institute.institute_id");
        while (rs1.next()) {
            System.out.println(rs1.getString("rollno") + "\t " + rs1.getString("name") + "\t " + rs1.getString("per") + "\t " + rs1.getString("institute_name"));
        }

        // LEFT JOIN
        System.out.println("\nLeft join");
        System.out.println("rollno\t name\t per\t institute");
        ResultSet rs2 = stmt.executeQuery("SELECT * FROM Student LEFT JOIN Institute ON Student.institute_id = Institute.institute_id");
        while (rs2.next()) {
            System.out.println(rs2.getString("rollno") + "\t " + rs2.getString("name") + "\t " + rs2.getString("per") + "\t " + rs2.getString("institute_name"));
        }

        // FULL JOIN (simulated using UNION)
        System.out.println("\nFull join (Simulated)");
        System.out.println("rollno\t name\t per\t institute");
        String fulljoin = "SELECT * FROM Student LEFT JOIN Institute ON Student.institute_id = Institute.institute_id " +
                          "UNION " +
                          "SELECT * FROM Student RIGHT JOIN Institute ON Student.institute_id = Institute.institute_id";

        ResultSet rs3 = stmt.executeQuery(fulljoin);
        while (rs3.next()) {
            System.out.println(rs3.getString("rollno") + "\t " + rs3.getString("name") + "\t " + rs3.getString("per") + "\t " + rs3.getString("institute_name"));
        }

        stmt.close();
        con.close();
    }
}

