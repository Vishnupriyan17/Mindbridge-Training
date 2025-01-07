package Day9.HashTable;

import java.util.Hashtable;
import java.util.Scanner;

public class ContactDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String,String> contact = new Hashtable<String,String>();
        contact.put("Vishnu", "6369571266");
        contact.put("Pavi", "9345231266");
        contact.put("Sayee", "9083571266");
        contact.put("Gogul", "9876571266");
        System.out.println("Contact Directory\n");
        for (var value : contact.entrySet()) {
            System.out.println(value);
        }
        System.out.println();
        System.out.println("Enter the contact name that you have to search: ");
        String name = sc.nextLine();
        for(int i =0;i< contact.size();i++)
        {
            if(contact.containsKey(name))
            {
                System.out.println("Search contact: "+contact.get(name));
                break;
            }
        }
        System.out.println("Removed Contact: "+ name +" "+contact.remove(name));
    }
}
