package Day6.Clone;

public class Main implements Cloneable{
    String nsme;
    int age;
    Main(String s,int age){
        this.nsme=s;
        this.age=age;
    }
    public void display(){
        System.out.println("name"+nsme);
        System.out.println("name"+age);
    }

    public static void main(String[] args) {
        try{
            Main main = new Main("vishnu",20);
//            Main main2 = new Main();
            Main main1 = (Main)main.clone();
            System.out.println(main.hashCode());
//            System.out.println(main2 .hashCode());
            System.out.println(main1.hashCode());
            main.display();
            main1.display();
        }
        catch (Exception e)
        {

        }
    }
}
