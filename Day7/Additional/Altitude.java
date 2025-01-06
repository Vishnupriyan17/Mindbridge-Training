package Day7.Additional;

import java.util.Arrays;

public class Altitude {
    public static void main(String[] args) {
        int gain[] = {-5,1,5,0,-7};
        int sum =0;
        int arr[] = new int[gain.length+1];
        arr[0] = sum;
        for(int i =0;i< gain.length;i++)
        {
            sum = arr[i]+gain[i];
            arr[i+1] = sum;
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
