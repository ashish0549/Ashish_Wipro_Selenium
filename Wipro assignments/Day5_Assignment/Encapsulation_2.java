//2. Rectangle Enforced Positive Dimensions
//Encapsulate validation and provide derived calculations.
//•	Build a Rectangle class with private width and height.
//•	Constructor and setters should reject or correct non-positive values (e.g., use default or throw an exception).
//•	Provide getArea() and getPerimeter() methods.
//•	Include displayDetails() method.


package Day_5_Assignment;
class Rectangle {
    private double w;
    private double h;

  
    public Rectangle(double w, double h) {
        setWidth(w);
        setHeight(h);
    }

    public void setWidth(double w) {
        if (w > 0) {
            this.w = w;
        } else {
            System.out.println("Invalid width. Setting to default value 1.");
            this.w = 1;
        }
    }

    public void setHeight(double h) {
        if (h > 0) {
            this.h = h;
        } else {
            System.out.println("Invalid height. Setting to default value 1.");
            this.h = 1;
        }
    }

    public double getWidth() {
        return w;
    }

   
    public double getHeight() {
        return h;
    }

    
    public double getArea() {
        return w*h;
    }

 
    public double getPerimeter() {
        return 2 * (w+h);
    }
    public void displayDetails() {
        System.out.println("Rectangle Details:");
        System.out.println("Width: " + w);
        System.out.println("Height: " + h);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

public class Encapsulation_2 {
	public static void main(String[] args) {
      
        Rectangle rect1 = new Rectangle(5, 10);
        rect1.displayDetails();

        System.out.println();

        Rectangle rect2 = new Rectangle(-4, 0);
        rect2.displayDetails();
    }
}
