abstract class Shape {
    abstract void draw();   // abstract method

    void message() {         // concrete method
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    void draw() {           // providing implementation for abstract method
        System.out.println("Drawing a Circle.");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();          // calls the implemented method in Circle
        s.message();      // calls the concrete method in Shape
    }
}