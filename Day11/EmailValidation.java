package Day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String text = "vishnukodees123!gmail.com";
        if(validateEmail(text))
        {
            System.out.println(text+" Valid");
        }
        else {
            System.out.println(text +" Invalid");
        }
    }
    public static boolean validateEmail(String text)
    {
        String pattern = "^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(text);
        return matcher.matches();
    }
}
