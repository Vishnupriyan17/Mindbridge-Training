package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Letters {
    public void printName(List<Letter> names, Predicate<Letter> condition)
    {
        for(Letter name : names)
        {
            if(condition.test(name))
            {
                System.out.println(name.getName());
            }
        }
    }

    public Letters() {
        List<Letter> names = new ArrayList<Letter>();
        Letter let1 = new Letter("Apple");
        Letter let2 = new Letter("Banana");
        Letter let3 = new Letter("Avocado");
        Letter let4 = new Letter("Cherry");
        names.add(let1);
        names.add(let2);
        names.add(let3);
        names.add(let4);
        printName(names, (name) -> name.getName().charAt(0) == name.getChar());
    }
    public static void main(String[] args){
            Letters letter = new Letters();
        }
}
