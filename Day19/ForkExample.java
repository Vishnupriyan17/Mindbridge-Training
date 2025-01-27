package Day19;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkExample {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        SumTask task = new SumTask(0,100000);
        long result = (long) forkJoinPool.invoke(task);
        System.out.println(result);
    }

}
class SumTask extends RecursiveTask{
    long threshold = 10000;
    long start;
    long end;

    public SumTask(long start,long end)
    {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Object compute() {
        if(end - start <= threshold)
        {
            long sum =0;
            for(long i =start;i<end;i++)
            {
                sum = sum+i;
            }
            return sum;
        }
        else{
            long mid = (start+end)/2;
            SumTask left = new SumTask(start,mid);
            SumTask right = new SumTask(mid+1,end);

            left.fork();
            right.fork();

            long leftResult = (long) left.join();
            long rightResult = (long) right.join();

            return leftResult + rightResult;
        }
    }
}
