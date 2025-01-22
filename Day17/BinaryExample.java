package Day17;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryExample {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 56;
        BinaryOperator<Integer> biOpe = BinaryOperator.maxBy(Comparator.naturalOrder());
        int result = biOpe.apply(num1,num2);
        System.out.println(result);
    }
}
