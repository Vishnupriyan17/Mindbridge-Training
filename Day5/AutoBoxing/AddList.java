package Day5.AutoBoxing;
import java.util.ArrayList;
import java.util.List;
public class AddList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0,10);
        list.add(1,20);
        list.add(2,30);
        list.add(3,40);
        Integer sum =0;
        for(int i :list)
        {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
