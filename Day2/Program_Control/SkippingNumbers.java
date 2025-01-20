package Day2.Program_Control;
public class SkippingNumbers {
    public static void main(String[] args) {
       first: for(int i =1;i<=100;i++)
        {
            if(i%5 == 0)
            {
                continue first;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
