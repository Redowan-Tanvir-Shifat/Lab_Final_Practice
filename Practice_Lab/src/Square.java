public class Square extends Shape{
    double height;
    public Square(double height) {
        this.height = height;
    }
    public double calculateArea() {
        return height * height;
    }
    public double calculatePerimeter() {
        return (4 * height);
    }
}
class Rectangle extends Shape{
    double height, width;
    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double calculateArea() {
        return height * width;
    }
    public double calculatePerimeter() {
        return (2 * height) + (2 * width);
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return (Math.PI) * (radius * radius);
    }
    public double calculatePerimeter() {
        return 2 * (Math.PI) * radius;
    }
}
