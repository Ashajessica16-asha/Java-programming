public class AbstractDemo { 
 
    // Abstract class 
    static abstract class Shape { 
        abstract void area();   // abstract method - no body 
 
        void display() {        // concrete method 
            System.out.println("This is a Shape"); 
        } 
    } 
 
    static class Rectangle extends Shape { 
        double length, width; 
        Rectangle(double l, double w) { length = l; width = w; } 
        void area() { 
            System.out.println("Area of Rectangle: " + (length * width)); 
        } 
    } 
 
    static class Circle extends Shape { 
        double radius; 
        Circle(double r) { radius = r; } 
      void area() { 
            System.out.println("Area of Circle: " + (3.14159 * radius * radius)); 
        } 
    } 
 
    public static void main(String[] args) { 
        Shape shapeRef; 
 
        shapeRef = new Rectangle(5.0, 3.0); 
        shapeRef.display(); 
        shapeRef.area(); 
 
        shapeRef = new Circle(4.0); 
        shapeRef.display(); 
        shapeRef.area(); 
 
        // Shape s = new Shape();  // Error: cannot instantiate an abstract class 
    } 
} 