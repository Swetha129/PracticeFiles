package CorePractice;

public interface Shape {
    double calculateArea();

    double calculatePerimeter();
}

class Circle1 implements Shape {
    int radius;

    public Circle1(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (double)this.radius * (double)this.radius;
    }

    public double calculatePerimeter() {
        return 6.283185307179586 * (double)this.radius;
    }
}