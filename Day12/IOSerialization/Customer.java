package Day12.IOSerialization;

import java.io.*;

public class Customer implements Externalizable {
    String name;
    transient int id;
        public Customer()
        {

        }
        public void setName(String name)
        {
            this.name = name;
        }
        public void setId(int id)
        {
            this.id = id;
        }
        public String getName()
        {
            return name;
        }
        public int getId()
        {
            return id;
        }
        public void writeExternal(ObjectOutput out) throws IOException {
            System.out.println("External");
            out.write(id);
        }
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Internal");
        id = in.read();
    }

}
