package Day3.Inheritance;
class Square extends Rectangle{
    Square(double side)
    {
        super(side,side);
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length*breadth;
    }
}
public class Shape {
    public double area()
    {
        return 0;
    }
    public static void main(String[] args) {
        Shape shape = new Rectangle(4.5,6.7);
        System.out.println("The area of rectangle is: "+shape.area());

        Shape shape1 = new Square(4.5);
        System.out.println("The area of square is: "+shape1.area());

    }
}
