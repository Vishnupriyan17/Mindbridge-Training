package Day6.Math;

public class ExecutionTime {

    public static void main(String[] args) {
        System.out.println("Starting the loop...");

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 2000000000; i++) {
            int temp = i * 2;
        }

        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;

        System.out.println("Execution time of the loop: " + executionTime + " milliseconds.");
    }
}

