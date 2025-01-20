package Day13;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest{
    @Test
    public void evenLength() {
        String result = Palindrome.checkPalindrome("abba");
        assertEquals("Input is palindrome", result);
    }
    @Test
    public void oddLength() {
        String result = Palindrome.checkPalindrome("madam");
        assertEquals("Input is palindrome", result);
    }
    @Test
    public void nonPalindrome() {
        String result = Palindrome.checkPalindrome("hello");
        assertEquals("Input is not palindrome", result);
    }
    @Test
    public void insensitivePalindrome() {
        String result = Palindrome.checkPalindrome("abba");
        assertEquals("Input is palindrome", result);
    }
    @Test
    public void specialCharacters() {
        String result = Palindrome.checkPalindrome("an@NA");
        assertEquals("Input is palindrome", result);
    }
    @Test
    public void nullInput() {
        String result = Palindrome.checkPalindrome(null);
        assertEquals("Input is null", result);
    }

}