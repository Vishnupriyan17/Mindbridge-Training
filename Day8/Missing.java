package Day8;

import java.util.Arrays;

public class Missing {
    public static void main(String[] args) {
        int arr[] = {3,0,1};
        Arrays.sort(arr);
        int num = 1;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] != i)
            {
                num = i;
            }
        }
        System.out.println(num);
    }
}
