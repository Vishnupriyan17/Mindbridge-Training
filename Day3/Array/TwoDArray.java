package Day3.Array;

public class TwoDArray {
    public static void main(String[] args) {
        int arr1[][] = {{1,2},{3,4}} ;
        int arr2[][] = {{5,6},{6,7}};
        int arr3[][] = new int[2][2];

        int row = arr1.length;
        int clos = arr1[0].length;
        for(int i =0;i<row;i++)
        {
            for(int j =0;j<clos;j++)
            {
                    arr3[i][j] = arr1[i][j]+arr2[j][i];

            }
        }
        for(int i =0;i<row;i++)
        {
            for(int j =0;j<clos;j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
