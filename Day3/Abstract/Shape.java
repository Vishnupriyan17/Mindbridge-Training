package Day3.Abstract;
class Rectangle extends Shape
{
    double length;
    double breadth;
    Rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double calculateArea() {
        return length*breadth;
    }
}
class Circle extends Shape
{
    double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return 3.14*radius*radius;
    }
}
abstract class Shape {
    abstract double calculateArea();

    public static void main(String[] args) {
        Shape shape = new Circle(4.5);
        System.out.println("The area of circle is: "+shape.calculateArea());
        Shape shape1 = new Rectangle(4.5,6.7);
        System.out.println("The area of rectangle is: "+shape1.calculateArea());
    }
}
