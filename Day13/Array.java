package Day13;
import java.util.Arrays;
public class Array {
    public static String performSorting(int[] input)
    {
        int sortedArray[] = Arrays.copyOf(input,input.length);
        Arrays.sort(sortedArray);
        return Arrays.toString(sortedArray);
    }
    public static void main(String[] args) {
        int number[] = {1,6,2,3,4,7,-9};
        System.out.println(performSorting(number));
    }
}
