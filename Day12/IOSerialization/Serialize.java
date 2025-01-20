package Day12.IOSerialization;

import java.io.*;

public class Serialize {
    public static void main(String[] args) {
        Serialize serialize = new Serialize();
        serialize.doSer();
        serialize.doDeSer();
    }
    public void doSer()
    {
        ObjectOutputStream oss = null;
        try{
            Customer customer = new Customer();
            customer.setName("Vishnu");
            customer.setId(21);
            oss = new ObjectOutputStream(new FileOutputStream("D:\\Skills\\Mindbridge Training\\src\\Day12\\IOSerialization\\seria.txt"));
            oss.writeObject(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doDeSer(){
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream("D:\\Skills\\Mindbridge Training\\src\\Day12\\IOSerialization\\seria.txt"));
            Customer customer = (Customer)ois.readObject();
            System.out.println(customer.getName());
            System.out.println(customer.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
