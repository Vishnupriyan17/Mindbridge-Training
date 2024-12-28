package Day2.OOP_Basics;
import java.util.*;
class Operation{
    int sum = 0;
    public int addition(int number1,int number2)
    {
        return number1+number2;
    }
    public double addition(double number1,double number2)
    {
        return number1+number2;
    }
    public int addition(int arr[])
    {
        for(int num : arr)
        {
            sum = sum+num;
        }
        return sum;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Operation object = new Operation();
        System.out.println("Addition of two integer is; "+object.addition(2,5));
        System.out.println("Addition of two double is; "+object.addition(2.3,5.6));
        System.out.println("Addition of array is: "+object.addition(arr));
    }
}
