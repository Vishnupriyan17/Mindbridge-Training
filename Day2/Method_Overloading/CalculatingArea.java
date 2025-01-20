package Day2.Method_Overloading;
import java.util.*;
class Operation{
    public void circle(double radius)
    {
        System.out.println("Area of the circle is: "+3.14*radius*radius);
    }
    public void rectangle(double length,double width)
    {
        System.out.println("Area of the rectangle is: "+length*width);
    }
    public void triangle(double breadth,double height)
    {
        System.out.println("Area of the triangle is: "+0.5*(breadth*height));
    }
}
public class CalculatingArea {
    public static void main(String[] args) {
        Operation object = new Operation();
        object.circle(5.6);
        object.rectangle(4.5,6.7);
        object.triangle(12.5,54.3);
    }
}
