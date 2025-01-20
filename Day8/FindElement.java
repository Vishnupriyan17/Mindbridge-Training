package Day8;

import java.util.Arrays;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {4,5,2,10};
        for(int i=0;i<arr.length;i++)
        {
            int max = arr[0];
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[j] > max)
                {
                    arr[i] = arr[j];
                    break;
                }
            }
        }
        arr[arr.length-1] = -1;
        System.out.println(Arrays.toString(arr));
    }
}
