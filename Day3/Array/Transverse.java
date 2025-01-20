package Day3.Array;

public class Transverse {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,6},{3,4,7},{5,6,7}};
        int row = arr1.length;
        int clos = arr1[0].length;
        for(int i =0;i<row;i++)
        {
            int temp = 0;
            for(int j =i+1;j<clos;j++)
            {
                if(i == j)
                {
                    continue;
                }
                else{
                    temp = arr1[i][j];
                    arr1[i][j] = arr1[j][i];
                    arr1[j][i] = temp;
                }
            }
        }
        for(int i =0;i<row;i++)
        {
            for(int j =0;j<clos;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
