package Day5.shapes;

public class Rectangle {
    double length;
    double breadth;
    public Rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
        public void calculateArea()
        {
            System.out.println("Area of rectabgle is: "+length*breadth);
        }
    }
