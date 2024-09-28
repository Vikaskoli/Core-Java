package OOPs;

class Shape {
    // Method to draw a generic shape
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    // Overriding draw() method to draw a circle
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape {
    // Overriding draw() method to draw a rectangle
    @Override
    void draw() {
        System.out.println("Drawing Rectangle...");
    }
}

public class overridingDemo {
    public static void main(String[] args) {
        // Creating a Shape object and calling its draw method
        Shape shape = new Shape();
        shape.draw();  // Outputs: Drawing shape

        // Creating a Circle object and calling its draw method
        Circle circle = new Circle();
        circle.draw();  // Outputs: Drawing circle

        // Creating a Rectangle object and calling its draw method
        Rectangle rectangle = new Rectangle();
        rectangle.draw();  // Outputs: Drawing Rectangle...

        // Polymorphism: Shape reference to a Circle object
        Shape shape1 = new Circle();
        shape1.draw();  // Outputs: Drawing circle (due to polymorphism)
    }
}


//When a subclass (like Circle or Rectangle) provides its own specific implementation of a method
// that is already defined in its superclass (Shape), it’s called method overriding.
