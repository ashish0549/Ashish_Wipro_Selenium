//2. Moveable Shapes Simulation
//•	Define an interface Movable with methods: moveUp(), moveDown(), moveLeft(), moveRight().
//•	Implement classes:
//o	MovablePoint(x, y, xSpeed, ySpeed) implements Movable
//o	MovableCircle(radius, center: MovablePoint)
//o	MovableRectangle(topLeft: MovablePoint, bottomRight: MovablePoint) (ensuring both points have same speed)
//•	Provide toString() to display positions.
//•	In main(), create a few objects and call move methods to simulate motion.
//

package Day_5_Assignment;
//Interface
interface Movable {
 void moveUp();
 void moveDown();
 void moveLeft();
 void moveRight();
}

//MovablePoint
class MovablePoint implements Movable {
 int x, y, xSpeed, ySpeed;

 public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
     this.x = x; this.y = y;
     this.xSpeed = xSpeed; this.ySpeed = ySpeed;
 }

 public void moveUp()    { y += ySpeed; }
 public void moveDown()  { y -= ySpeed; }
 public void moveLeft()  { x -= xSpeed; }
 public void moveRight() { x += xSpeed; }

 public String toString() {
     return "Point(" + x + ", " + y + ")";
 }
}

//MovableCircle
class MovableCircle implements Movable {
 private int radius;
 private MovablePoint center;

 public MovableCircle(int radius, MovablePoint center) {
     this.radius = radius;
     this.center = center;
 }

 public void moveUp()    { center.moveUp(); }
 public void moveDown()  { center.moveDown(); }
 public void moveLeft()  { center.moveLeft(); }
 public void moveRight() { center.moveRight(); }

 public String toString() {
     return "Circle(center: " + center + ", radius: " + radius + ")";
 }
}

//MovableRectangle
class MovableRectangle implements Movable {
 private MovablePoint topLeft;
 private MovablePoint bottomRight;

 public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
     if (topLeft.xSpeed != bottomRight.xSpeed || topLeft.ySpeed != bottomRight.ySpeed) {
         throw new IllegalArgumentException("Points must have the same speed.");
     }
     this.topLeft = topLeft;
     this.bottomRight = bottomRight;
 }

 public void moveUp() {
     topLeft.moveUp();
     bottomRight.moveUp();
 }

 public void moveDown() {
     topLeft.moveDown();
     bottomRight.moveDown();
 }

 public void moveLeft() {
     topLeft.moveLeft();
     bottomRight.moveLeft();
 }

 public void moveRight() {
     topLeft.moveRight();
     bottomRight.moveRight();
 }

 public String toString() {
     return "Rectangle(topLeft: " + topLeft + ", bottomRight: " + bottomRight + ")";
 }
}

public class Interface_2 {
	public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(0, 0, 2, 2);
        System.out.println("Initial Point: " + p1);
        p1.moveRight();
        p1.moveUp();
        System.out.println("After moving: " + p1);

        MovableCircle circle = new MovableCircle(5, new MovablePoint(10, 10, 1, 1));
        System.out.println("\nInitial Circle: " + circle);
        circle.moveLeft();
        circle.moveDown();
        System.out.println("After moving: " + circle);

        MovableRectangle rect = new MovableRectangle(
            new MovablePoint(0, 10, 3, 3),
            new MovablePoint(10, 0, 3, 3)
        );
        
        System.out.println("\nInitial Rectangle: " + rect);
        rect.moveUp();
        rect.moveRight();
        System.out.println("After moving: " + rect);
    }
}
