package Day6.string;
public class Program1 {
    public static void main(String[] args) {
        String name = "Vishnupriyan";
        System.out.println(countWords(name));
        System.out.println(reverseString(name));
        System.out.println(replaceVowels(name));
    }
    public static int countWords(String name)
    {
        return name.length()+1;
    }
    public static String reverseString(String name)
    {
        String reverse = "";
        for(int i = name.length()-1;i>=0;i--)
        {
            reverse = reverse+name.charAt(i);
        }
        return reverse;
    }
    public static String replaceVowels(String name)
    {
        String replace= "";
        for(int i =0;i<name.length()-1;i++)
        {
            if(name.charAt(i) == 65 ||name.charAt(i) == 69 ||name.charAt(i) == 73||name.charAt(i) == 79||name.charAt(i) == 85||
                    name.charAt(i)== 97 || name.charAt(i) == 101 ||name.charAt(i) == 105 || name.charAt(i) == 111 || name.charAt(i) == 117)
            {
                replace = replace+"*";
            }
            else{
                replace = replace+name.charAt(i);
            }
        }
        return replace;
    }
}
