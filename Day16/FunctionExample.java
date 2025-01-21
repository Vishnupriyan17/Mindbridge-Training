package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    FunctionExample()
    {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("Java");
        Function<String,Integer> function = (word) -> word.length();

        List<Integer> length = new ArrayList<>();
        for(String str:words)
        {
            System.out.println(function.apply(str));
        }
    }
    public static void main(String[] args) {
        FunctionExample functionExample = new FunctionExample();
    }
}
