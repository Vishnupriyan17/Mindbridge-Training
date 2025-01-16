package Day13;
public class ReverseString {
    static String reverse(String input)
    {
        if(input == null)
        {
            return "string cannot be null";
        }
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
            System.out.println(reverse("vishnu"));
            System.out.println(reverse("Vishnu"));
            System.out.println(reverse(""));
            System.out.println(reverse("v"));
            System.out.println(reverse(null));
    }
}
