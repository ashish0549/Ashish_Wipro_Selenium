//
//Q2. Create a Product class and sort products by price using Comparable.
//Implement Comparable<Product> and sort a list of products using Collections.sort().



package Comparable_comparator;
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
    public String getName() {
        return name;
    }

   
    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price); // Ascending order
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + '}';
    }
}
public class Comparable_product {
	public static void main(String[] args) {
     
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Laptop", 50000));
        products.add(new Product(102, "Smartphone", 60000));
        products.add(new Product(103, "Tablet", 35000));
        products.add(new Product(104, "Smartwatch", 25000));

       
        Collections.sort(products);

     
        System.out.println("Products sorted by price :");
        for (Product p : products) {
            System.out.println(p);
        }
    }

}
