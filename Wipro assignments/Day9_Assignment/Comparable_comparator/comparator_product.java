
//Q7. Create multiple sorting strategies for a Product class.
//Implement comparators to sort by:
//Price ascending
//Price descending
//Name alphabetically


package Comparable_comparator;
import java.util.*;

class Item {
    private int id;
    private String name;
    private double price;

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
    }

    public static final Comparator<Item> PRICE_ASCENDING = new Comparator<Item>() {
        
        public int compare(Item p1, Item p2) {
            return Double.compare(p1.getPrice(), p2.getPrice());
        }
    };

    
    public static final Comparator<Item> PRICE_DESCENDING = new Comparator<Item>() {
    
        public int compare(Item p1, Item p2) {
            return Double.compare(p2.getPrice(), p1.getPrice());
        }
    };

    
    public static final Comparator<Item> NAME_ALPHABETICALLY = new Comparator<Item>() {
        
        public int compare(Item p1, Item p2) {
            return p1.getName().compareToIgnoreCase(p2.getName());
        }
    };
}
public class comparator_product {
	public static void main(String[] args) {
        
        List<Item> products = new ArrayList<>();
        products.add(new Item(101, "Laptop", 50000));
        products.add(new Item(102, "Smartphone", 60000));
        products.add(new Item(103, "Tablet", 35000));
        products.add(new Item(104, "Smartwatch", 25000));

       
        System.out.println("Original list:");
        products.forEach(System.out::println);

       
        Collections.sort(products, Item.PRICE_ASCENDING);
        System.out.println("\nSorted by Price (Asc):");
        products.forEach(System.out::println);

        
        Collections.sort(products, Item.PRICE_DESCENDING);
        System.out.println("\nSorted by Price (Desc):");
        products.forEach(System.out::println);

      
        Collections.sort(products, Item.NAME_ALPHABETICALLY);
        System.out.println("\nSorted by Name (Alpha):");
        products.forEach(System.out::println);
    }
}
