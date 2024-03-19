package CorePractice;

class Rectangle implements Shape {
    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return (double)(this.length * this.width);
    }

    public double calculatePerimeter() {
        return (double)(2 * (this.length + this.width));
    }
}

public class FindAreaAndPerimeter {
    public FindAreaAndPerimeter() {
    }

    public static void main(String[] args) {
        Circle1 circle = new Circle1(3);
        Rectangle rectangle = new Rectangle(3, 3);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculatePerimeter());
    }
}