package JDBC_conn;

import java.sql.*;

public class EmployeeProcedureCaller {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "root";


        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            CallableStatement stmt = conn.prepareCall("{CALL update_employee_and_report()}");

            boolean hasResults = stmt.execute();

            int resultSetCount = 1;
            while (hasResults) {
                ResultSet rs = stmt.getResultSet();

                System.out.println("---- Result Set " + resultSetCount + " ----");
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnsNumber = rsmd.getColumnCount();

                while (rs.next()) {
                    for (int i = 1; i <= columnsNumber; i++) {
                        System.out.print(rsmd.getColumnLabel(i) + ": " + rs.getString(i) + " | ");
                    }
                    System.out.println();
                }

                rs.close();
                hasResults = stmt.getMoreResults();
                resultSetCount++;
            }

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}