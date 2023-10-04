class Shape {
    protected int length;
    protected int width;

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void displayArea() {

    }
}
class Circle extends Shape {
    public Circle(int radius) {
        super(radius, radius);
    }
    @Override
    public void displayArea() {
        double area = Math.PI * length * length;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void displayArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }
    @Override
    public void displayArea() {
        double area = 0.5 * length * width;
        System.out.println("Area of Triangle: " + area);
    }
}
public class AbstractShape {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);
        circle.displayArea();
        rectangle.displayArea();
        triangle.displayArea();
    }
}