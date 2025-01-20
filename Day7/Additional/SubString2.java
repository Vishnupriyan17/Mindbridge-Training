package Day7.Additional;

public class SubString2 {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        int count = 0;
        for(int i =0;i<sequence.length()-word.length();i++)
        {
            String check = "";
            int move=i;
            for(int j =0;j<word.length();j++)
            {
                check = check+sequence.charAt(move++);
            }
            if(check.equals(word))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
