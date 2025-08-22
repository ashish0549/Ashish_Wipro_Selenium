package Day_11_Assignment;
import java.sql.*;
import java.util.*;


class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

   
    public int compareTo(Product other) {

        return Double.compare(this.price, other.price);
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price;
    }
}

public class productsort {
    private static final String URL = "jdbc:mysql://localhost:3306/dbb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String sql = "SELECT * FROM products";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                products.add(new Product(id, name, price));
            }

            Collections.sort(products);

            for (Product p : products) {
                System.out.println(p);
            }
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
