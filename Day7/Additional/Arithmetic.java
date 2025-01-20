package Day7.Additional;
class Adder extends Arithmetic{
    public int add(int number1,int number2)
    {
        return number1+number2;
    }
}
public class Arithmetic {
    public static void main(String[] args) {
       int number1 = 5;
       int number2 = 7;
        Adder adder = new Adder();
        System.out.println(adder.add(number1,number2));
    }
}
