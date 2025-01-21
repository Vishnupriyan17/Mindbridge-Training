package Day16;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
public class BiConsumerExample {
        public BiConsumerExample()
        {
            Map<Integer,Integer> numbers = new HashMap<>();
            numbers.put(3,5);
        BiConsumer<Integer,Integer> sumPrinter = (num1, num2) ->
                System.out.println("The sum is: " + (num1 + num2));

            numbers.forEach(sumPrinter);
    }
    public static void main(String[] args) {
        BiConsumerExample biCons = new BiConsumerExample();
    }
}
