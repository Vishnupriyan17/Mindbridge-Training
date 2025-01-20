package Day3.Array;

public class One {
    static int arr[] = {2,4,1,5,6};
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
            else if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Minimum value is: "+min+"\nMaximum value is: "+max);
    }
}
