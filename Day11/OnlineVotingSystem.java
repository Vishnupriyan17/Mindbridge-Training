package Day11;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.Scanner;
public class OnlineVotingSystem {

    // ConcurrentMap to store candidate names and their vote counts
    private static final ConcurrentMap<String, Integer> votes = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        // Simulate voters using threads
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1.Add a vote to a existing candidate");
            System.out.println("2.Add a new candidate and vote");
            System.out.println("3.Display the current vote count");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Existing candidate: \n Alice \n Bob");
                    System.out.println("Enter a candidate name you want to vote: ");
                    String candidateName = sc.next();
                    Thread thread1 = new Thread(() -> vote(candidateName));
                    thread1.start();
                    thread1.join();
                    break;
                case 2:
                    System.out.print("Enter the new candidate's name: ");
                    String newCandidate = sc.next();
                    Thread thread2 = new Thread(() -> addCandidateAndVote(newCandidate));
                    thread2.start();
                    thread2.join();
                    break;

                case 3:
                    displayResults();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to cast a vote for a candidate
    public static void vote(String candidate) {
        votes.merge(candidate,1,Integer::sum);
        System.out.println("Thanks for voting");
    }

    public static void addCandidateAndVote(String candidate) {
        votes.putIfAbsent(candidate, 0);
        vote(candidate);


    }

    // Display the final vote counts
    public static void displayResults() {
        System.out.println("Final Vote Counts:");
        votes.forEach((candidate, count) -> System.out.println(candidate + ": " + count + " votes"));
    }
}
