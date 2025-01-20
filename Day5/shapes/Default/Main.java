package Day5.Default;
import Day5.shapes.*;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.9);
        Rectangle rectangle = new Rectangle(4.5,6);
        circle.calculateArea();
        rectangle.calculateArea();
    }

}
