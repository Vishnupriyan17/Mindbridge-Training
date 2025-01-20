package Day7.Additional;

public class Palindrome {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abca");
        StringBuilder palin ;
        for(int i =0;i<s.length()-1;i++)
        {
            for(int j  =0;j<s.length();j++)
            {
                if(s.charAt(i) == s.charAt(j)) {
                    palin = new StringBuilder(s.substring(i, s.length()));
                    palindrome(palin);
                }
            }
        }
    }
    public static boolean palindrome(StringBuilder palin)
    {
        for(int i =0;i<palin.length()-1;i++)
        {
            String check = "";
            StringBuilder temp = palin;
            StringBuilder add = temp.deleteCharAt(i);
            check = check + add;
            System.out.println(check);
        }
        return false;
    }
}
