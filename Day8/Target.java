package Day8;

public class Target {
        public static void main(String[] args) {
            int arr[] = {2,7,11,15};
            int target = 9;
            int sum =0;
            for(int i =0;i<arr.length;i++)
            {
                for(int j =i;j< arr.length;j++)
                {
                    sum = sum +arr[j];
                    if(sum == target)
                    {
                        System.out.println("["+i+","+j+"]");
                        return;
                    }
                }
            }
        }
    }
