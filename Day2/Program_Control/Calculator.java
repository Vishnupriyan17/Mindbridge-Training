package Day2.Program_Control;
import java.sql.SQLOutput;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice Number:"+'\n'+"1.Addition"+"\n"+"2.Subtraction"+"\n"+"3.Multiplication"+"\n"+"4.Division");
        int choice = sc.nextInt();
        System.out.println("Enter your First Number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter your Second Number: ");
        int number2 = sc.nextInt();
        System.out.println(calculate(number1,number2,choice));
    }
    static int calculate(int n1,int n2,int choice)
    {
        switch (choice)
        {
            case 1:
                return n1+n2;
            case 2:
                return n1-n2;
            case 3:
                return n1*n2;
            case 4:
                return n1/n2;
            default:
                System.out.println("Enter a valid input");

        }
        return -1;
    }
}
