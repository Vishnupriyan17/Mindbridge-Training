package Day5.AutoBoxing;

public class Varargs {
    static int sum =0;
    public static void sum(int num,int... varargs)
    {
        for(int i =0;i< varargs.length;i++)
        {
            sum = sum+varargs[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum(10,20,30,40,50,60,70);
    }
}
