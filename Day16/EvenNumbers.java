package Day16;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class EvenNumbers {

    public static void printEven(List<Even> numbers, IntPredicate condition)
    {
        for (Even num : numbers) {
            if (condition.test(num.getNum())) {
                System.out.println(num.getNum());
            }
        }
    }
    public static void main(String[] args) {
        List<Even> numbers = new ArrayList<Even>();
        Even even1 = new Even(12);
        Even even2 = new Even(44);
        Even even3 = new Even(22);
        Even even4 = new Even(35);
        Even even5 = new Even(60);
        numbers.add(even1);
        numbers.add(even2);
        numbers.add(even3);
        numbers.add(even4);
        numbers.add(even5);
        printEven(numbers,nums -> nums %2 == 0);
    }
}
