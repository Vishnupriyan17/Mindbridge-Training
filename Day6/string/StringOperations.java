package Day6.string;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult < 0) {
            System.out.println("The first string is lexicographically smaller than the second string.");
        } else if (comparisonResult > 0) {
            System.out.println("The first string is lexicographically greater than the second string.");
        } else {
            System.out.println("The two strings are lexicographically equal.");
        }

        if (str1.equals(str2)) {
            System.out.println("The two strings are equal (case-sensitive).");
        } else {
            System.out.println("The two strings are not equal (case-sensitive).");
        }

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("The two strings are equal (case-insensitive).");
        } else {
            System.out.println("The two strings are not equal (case-insensitive).");
        }

        String concatenatedString = str1 + str2;
        System.out.println("Concatenated string: " + concatenatedString);
    }
}

