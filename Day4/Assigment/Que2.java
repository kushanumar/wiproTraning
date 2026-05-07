package Day4.Assigment;


interface Polygon {
 float getArea();

 default float getPerimeter(int... sides) {
     float sum = 0;
     for (int side : sides) {
         sum += side;
     }
     return sum;
 }

 static String shapeInfo() {
     return "A polygon is a 2D shape with straight sides.";
 }
}

class Rectangle implements Polygon {
 int length, width;

 Rectangle(int length, int width) {
     this.length = length;
     this.width = width;
 }

 public float getArea() {
     return length * width;
 }
}

class Triangle implements Polygon {
 int base, height;

 Triangle(int base, int height) {
     this.base = base;
     this.height = height;
 }

 public float getArea() {
     return 0.5f * base * height;
 }
}

public class Que2 {
 public static void main(String[] args) {

     Rectangle rect = new Rectangle(10, 5);
     System.out.println("Rectangle Area: " + rect.getArea());
     System.out.println("Rectangle Perimeter: " + rect.getPerimeter(10, 5, 10, 5));

     Triangle tri = new Triangle(6, 4);
     System.out.println("Triangle Area: " + tri.getArea());
     System.out.println("Triangle Perimeter: " + tri.getPerimeter(3, 4, 5));

     System.out.println(Polygon.shapeInfo());
 }
}