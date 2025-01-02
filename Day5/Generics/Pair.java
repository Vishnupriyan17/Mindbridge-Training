package Day5.Generics;

public class Pair<K,V> {
    K key;
    V value;
    Pair(K name,V age)
    {
        this.key = name;
        this.value = age;
    }
    public void display()
    {
        System.out.println("Key: "+key+"\nValue: "+value);
    }

    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<String,Integer>("Vishnu",21);
        pair.display();
        Pair<Integer,String> pair1 = new Pair<Integer,String>(2121222,"Vishnu");
        pair1.display();
    }
}
