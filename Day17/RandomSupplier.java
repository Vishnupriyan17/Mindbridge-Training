package Day17;

import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier {
    RandomSupplier()
    {
        Random random = new Random();
        Supplier<Integer> randomNumber = () -> random.nextInt(100)+1;
        for(int i =0;i<5;i++)
        {
            System.out.println(randomNumber.get());
        }
    }
    public static void main(String[] args) {
        RandomSupplier random = new RandomSupplier();
    }
}
