package Day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class InstanceReference {
    public static void main(String[] args) {
        // List of strings to sort
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("bob");
        names.add("Charlie");
        names.add("david");
        names.add("Eve");

        BiFunction<String, String, Integer> stringComparator = String::compareToIgnoreCase;

        Collections.sort(names, (a, b) -> stringComparator.apply(a, b));

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

