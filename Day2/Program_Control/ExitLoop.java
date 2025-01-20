package Day2.Program_Control;
import java.util.*;
public class ExitLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int number;
        while(num != 0) {
            number = sc.nextInt();
            innerfor:for (int i = 0; i < 1; i++) {
                if (number == 0) {
                    num--;
                    break innerfor;
                }
                System.out.println(number);
            }
        }
    }
}
