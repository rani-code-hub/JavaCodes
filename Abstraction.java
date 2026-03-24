abstract class Shape {
    // Abstract method (no implementation)
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    // Implementation of the abstract method
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Shape s = new Shape(); // This would cause a compilation error
        Circle c = new Circle();
        c.draw();
        c.display();
    }
}