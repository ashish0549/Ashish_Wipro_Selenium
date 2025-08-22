
//6. Default and Static Methods in Interfaces
//•	Declare interface Polygon with:
//o	double getArea()
//o	default method default double getPerimeter(int... sides) that computes sum of sides
//o	a static helper static String shapeInfo() returning a description string
//•	Implement classes Rectangle and Triangle, providing appropriate getArea().
//•	In Main, call getPerimeter(...) and Polygon.shapeInfo().


package Day_5_Assignment;
interface Polygon {
    double getArea();

    default double getPerimeter(int... sides) {
        double sum = 0;
        for (int side : sides) {
            sum += side;
        }
        return sum;
    }

    static String shapeInfo() {
        return "Polygons have area and perimeter. Using appropriate sides for perimeter calculation.";
    }
}

class rect implements Polygon {
    private int l, w;

    public rect(int length, int width) {
        this.l = length;
        this.w = width;
    }

    @Override
    public double getArea() {
        return l * w;
    }
}

class Triangle implements Polygon {
    private int b, h;

    public Triangle(int base, int height) {
        this.b = base;
        this.h = height;
    }

    @Override
    public double getArea() {
        return 0.5 * b * h;
    }
}
public class Interface_6 {

	public static void main(String[] args) {
        rect rect = new rect(10, 5);
        Triangle tri = new Triangle(6, 4);

        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Rectangle Perimeter: " + rect.getPerimeter(10, 5, 10, 5));

        System.out.println("Triangle Area: " + tri.getArea());
        System.out.println("Triangle Perimeter: " + tri.getPerimeter(5, 6, 7));

        System.out.println("\nPolygon Info: " + Polygon.shapeInfo());
    }
}
