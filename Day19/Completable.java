package Day19;

import java.util.concurrent.CompletableFuture;

public class Completable {

    public static void main(String[] args) {
        CompletableFuture<String> userDataFuture = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Fetching user data...");
                Thread.sleep(2000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "User: John Doe, Age: 30";
        });

        CompletableFuture<String> userOrdersFuture = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Fetching user orders...");
                Thread.sleep(3000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Orders: [Laptop, Smartphone, Headphones]";
        });

        CompletableFuture<Void> combinedFuture = userDataFuture.thenCombine(userOrdersFuture, (userData, userOrders) -> {
            return userData + "\n" + userOrders;
        }).thenAccept(System.out::println);

        combinedFuture.join();
    }
}
