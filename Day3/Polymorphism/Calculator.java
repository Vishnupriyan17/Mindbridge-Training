package Day3.Polymorphism;

public class Calculator {
    public void add(int a,int b)
    {
        System.out.println("Sum of int a and b is: "+a+b);
    }
    public void add(double a,double b)
    {
        System.out.println("Sum of double a and b is: "+a+b);
    }
    public void add(int a,int b,int c)
    {
        System.out.println("sum of int a,b and c is: "+a+b+c);
    }
    public void add(double a,double b,double c)
    {
        System.out.println("sum of double a,b and c is: "+a+b+c);
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(3.4,5.6);
        calc.add(4.5,6,7.8);
        calc.add(2,3);
        calc.add(2,4,7);
    }
}
