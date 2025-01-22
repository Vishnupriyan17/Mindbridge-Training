package Day17;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleFunction;

public class StaticReference {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(4.5);
        numbers.add(5.5);
        numbers.add(6.5);
        numbers.add(3.5);
        numbers.add(9.5);
        for(Double number:numbers)
        {
            DoubleFunction<Double> squrt = Math::sqrt;
            Double res = squrt.apply(number);
            System.out.println("Square root of: "+number+" is "+res);
        }


    }
}
