package Day5.shapes;
    public class Circle{
        double radius;
        public Circle(double radius)
        {
            this.radius = radius;
        }
        public void calculateArea()
        {
            System.out.println("Area of a Circle: "+Math.PI*radius*radius);
        }
    }

