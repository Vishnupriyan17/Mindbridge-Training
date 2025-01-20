package Day6.Clone;

public class Main implements Cloneable{
    String s="vishnu";
    public static void main(String[] args) {
        try
        {
            Main main1 = new Main();  //new object
            Main main2 = (Main)main1.clone();  //cloned object
            System.out.println(main1.hashCode()+" "+main1.s.equals(main2.s)+" "+main2.hashCode());
            System.out.println(main1.hashCode()+" "+(main1 == main2)+" "+main2.hashCode());
        }
        catch(Exception e){

        }
    }
}
