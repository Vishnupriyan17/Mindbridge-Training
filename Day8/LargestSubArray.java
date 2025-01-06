package Day8;

public class LargestSubArray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for(int i =0;i<arr.length;i++)
        {
            int sum =0;
            for(int j =i;j<arr.length;j++)
            {
                sum = sum+arr[j];
                if(sum > max)
                {
                    max = sum;
                    start = i;
                    end = j;
                }
            }
        }
        for(int i = start;i<=end;i++)
        {
            System.out.print(+arr[i]+" ");
        }
        System.out.println("Largest Sum: "+max);
    }
}
