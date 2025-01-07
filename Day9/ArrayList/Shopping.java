package Day9.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("Milk");
        list.add("Eggs");
        list.add("Bread");
        list.add("Butter");
        System.out.println("List of items: "+list);
        System.out.println("Enter the item you need to remove: ");
        String item = sc.nextLine();

        list.remove(item);
        System.out.println("After removed item: "+list);
    }
}
