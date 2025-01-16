package Day13;

public class Palindrome {
    public static String checkPalindrome(String input)
    {
        if(input == null)
        {
            return "Input is null";
        }
        String processed = input.toLowerCase();
        String reverse = new StringBuilder(processed).reverse().toString();

        if(processed.equals(reverse))
        {
            return "Input is palindrome";
        }
        else {
            return "Input is not palindrome";
        }
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome("vishsiv"));
        System.out.println(checkPalindrome("ishsnu"));
        System.out.println(checkPalindrome("madam"));
        System.out.println(checkPalindrome("oddo"));
        System.out.println(checkPalindrome("Abba"));
        System.out.println(checkPalindrome("an@NA"));
    }
}
