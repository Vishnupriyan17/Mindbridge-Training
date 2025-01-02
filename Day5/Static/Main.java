package Day5.Static;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
class Calculate{
    double height;
    double base;
    double hypo;
    Calculate(double height,double base)
    {
        this.height = height;
        this.base= base;
    }
    public void calculateHypotenuse()
    {
        hypo = sqrt(pow(height,2)*pow(base,2));
        System.out.println("The hypotenuse of right angle triangle is: "+hypo);
    }
}
public class Main
{
    public static void main(String[] args) {
    Calculate calculate = new Calculate(4.5,67.8);
    calculate.calculateHypotenuse();
    }
}
