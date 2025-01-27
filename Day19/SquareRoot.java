package Day19;

import java.util.List;
import java.util.stream.Collectors;

public class SquareRoot {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 55, 67, 42, 99, 23, 88, 75, 61, 43, 102, 33, 80, 100);

        // Map numbers to their squares using parallel stream
        List<Integer> squares = numbers.parallelStream()
                .filter(num -> num > 50)
                .map(number -> number * number)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Squares (Parallel Stream): " + squares);
    }
}

