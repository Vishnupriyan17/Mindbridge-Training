package Day3.Array;

public class SumOfElements {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,5,6};
        int sum =0;
        for(int i =0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
