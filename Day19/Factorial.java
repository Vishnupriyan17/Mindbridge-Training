package Day19;

import java.util.concurrent.*;

public class Factorial implements Callable<Long>{
    int number ;
    public Factorial(int number)
    {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        if(number < 0)
        {
            throw new IllegalArgumentException("Input should not less than zero");
        }
        long result = 1;
        for(int i =1;i<number;i++)
        {
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        int number = 10;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try{
            Future<Long> future = executorService.submit(new Factorial(number));
            Long factorial = future.get();
            System.out.println(factorial);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            executorService.shutdown();
        }
    }
}
