package Day4.Assigment;

interface Movable {
 void moveUp();
 void moveDown();
 void moveLeft();
 void moveRight();
}

class MovablePoint implements Movable {
 int x, y;
 int xSpeed, ySpeed;

 MovablePoint(int x, int y, int xSpeed, int ySpeed) {
     this.x = x;
     this.y = y;
     this.xSpeed = xSpeed;
     this.ySpeed = ySpeed;
 }

 public void moveUp() {
     y += ySpeed;
 }

 public void moveDown() {
     y -= ySpeed;
 }

 public void moveLeft() {
     x -= xSpeed;
 }

 public void moveRight() {
     x += xSpeed;
 }

 public String toString() {
     return "Point(" + x + ", " + y + ")";
 }
}

class MovableCircle implements Movable {
 int radius;
 MovablePoint center;

 MovableCircle(int radius, MovablePoint center) {
     this.radius = radius;
     this.center = center;
 }

 public void moveUp() {
     center.moveUp();
 }

 public void moveDown() {
     center.moveDown();
 }

 public void moveLeft() {
     center.moveLeft();
 }

 public void moveRight() {
     center.moveRight();
 }

 public String toString() {
     return "Circle Center: " + center + ", Radius: " + radius;
 }
}

class MovableRectangle implements Movable {
 MovablePoint topLeft;
 MovablePoint bottomRight;

 MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
     
     if (topLeft.xSpeed != bottomRight.xSpeed || topLeft.ySpeed != bottomRight.ySpeed) {
         System.out.println("Error: Points must have same speed!");
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
     return "Rectangle TopLeft: " + topLeft + ", BottomRight: " + bottomRight;
 }
}


public class Que1 {
 public static void main(String[] args) {

     
     MovablePoint p1 = new MovablePoint(0, 0, 2, 3);
     System.out.println(p1);
     p1.moveUp();
     p1.moveRight();
     System.out.println("After move: " + p1);

     
     MovableCircle circle = new MovableCircle(5, new MovablePoint(1, 1, 1, 1));
     System.out.println(circle);
     circle.moveDown();
     circle.moveLeft();
     System.out.println("After move: " + circle);

     
     MovablePoint tl = new MovablePoint(0, 10, 2, 2);
     MovablePoint br = new MovablePoint(5, 5, 2, 2);
     MovableRectangle rect = new MovableRectangle(tl, br);

     System.out.println(rect);
     rect.moveRight();
     rect.moveDown();
     System.out.println("After move: " + rect);
 }
}
