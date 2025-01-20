package Day9.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(22);
        list.add(8);
        list.add(42);
        list.add(17);

        System.out.println("Maximum Element: "+ Collections.max(list));
    }
}
