package Day3.Interface;
class Circle implements Constants{
    double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double circleArea() {
        return Constants.PI*radius*radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println(circle.circleArea());
    }
}
public interface Constants {
    static double PI = 3.14;
    abstract double circleArea();
}
