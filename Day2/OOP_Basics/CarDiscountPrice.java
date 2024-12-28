package Day2.OOP_Basics;
import java.util.*;
class Car{
    double discountAmount;
    double discountPrice;
    double discountPercentage = 10.00;
    public void carDetails(String brand,String model,double price)
    {
        discountAmount = price * (discountPercentage/100);
        discountPrice = price-discountAmount;
        System.out.println("Brand of the Car: "+brand);
        System.out.println("Model of the Car: "+model);
        System.out.println("Price of the Car: "+price);
        System.out.println("Discounted Price for the Car: "+discountAmount);
    }
}
public class CarDiscountPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Car Brand: ");
        String brand = sc.nextLine();
        System.out.println("Enter your Car Model: ");
        String model = sc.nextLine();
        System.out.println("Enter your Car Price: ");
        double price = sc.nextDouble();
        Car c = new Car();
        c.carDetails(brand,model,price);
    }
}
