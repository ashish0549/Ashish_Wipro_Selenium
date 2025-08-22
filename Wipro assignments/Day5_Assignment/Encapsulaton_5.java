//5. Builder Pattern & Encapsulation: Immutable Product
//Use Builder design to create immutable class with encapsulation.
//•	Create an immutable Product class with private final fields such as name, code, price, and optional category.
//•	Use a static nested Builder inside the Product class. Provide methods like withName(), withPrice(), etc., that apply validation (e.g. non-negative price).
//•	The outer class should have only getter methods, no setters.
//•	The builder returns a new Product instance only when all validations succeed.


package Day_5_Assignment;
final class Product {
    
    private final String name;
    private final String code;
    private final double price;
    private final String category;

    private Product(Builder builder) {
        this.name = builder.name;
        this.code = builder.code;
        this.price = builder.price;
        this.category = builder.category;
    }

    
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    
    public static class Builder {
        private String name;
        private String code;
        private double price;
        private String category;

        public Builder withName(String name) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty.");
            }
            this.name = name;
            return this;
        }

        public Builder withCode(String code) {
            if (code == null || code.trim().isEmpty()) {
                throw new IllegalArgumentException("Code cannot be empty.");
            }
            this.code = code;
            return this;
        }

        public Builder withPrice(double price) {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative.");
            }
            this.price = price;
            return this;
        }

        public Builder withCategory(String category) {
            this.category = category;
            return this;
        }

        public Product build() {
            if (name == null || code == null) {
                throw new IllegalStateException("Name and Code are required fields.");
            }
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", code=" + code + ", price=" + price +
                (category != null ? ", category=" + category : "") + "]";
    }
}


public class Encapsulaton_5 {

	 public static void main(String[] args) {
	        try {
	            Product product = new Product.Builder()
	                    .withName("Laptop")
	                    .withCode("L_001")
	                    .withPrice(1299.99)
	                    .withCategory("Electronics")
	                    .build();

	            System.out.println(product);
	        } catch (IllegalArgumentException | IllegalStateException e) {
	            System.out.println("Error creating product: " + e.getMessage());
	        }
    }
}
