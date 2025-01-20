package Day6.Math;

public class Main {
    static int number1 = 20;
    static int number2 = 50;
    static String name = "Vishnupriyan";
    public static void main(String[] args) {
        System.out.println("Square Root a first number: "+Math.sqrt(number1));
        System.out.println("Power of number1 and number2: "+Math.pow(number1,number2));
        System.out.println("Maximum of two number: "+Math.max(number1,number2));
        System.out.println("Length of a string: "+name.length());
        System.out.println("Converting LowerCase to UpperCase: "+name.toUpperCase());
        System.out.println("Substring of a string: "+name.substring(0,6));
    }
}
