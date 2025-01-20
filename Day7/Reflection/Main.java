package Day7.Reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("Day7.Reflection.Person");

            //access all constructor
            System.out.println("Constructors\n");
            Constructor cons[] = cls.getDeclaredConstructors();
            //getting list of constructors
            for(int i =0;i< cons.length;i++)
            {
                System.out.println("Constructor "+(i+1)+" "+cons[i]);
            }
            Person per =(Person)cons[1].newInstance("Vishnu",123.234);

            System.out.println();

            //access of all methods
            System.out.println("Methods\n");

            Method met[] = cls.getDeclaredMethods();
            for(int i =0;i<met.length;i++)
            {
                System.out.println("Method "+(i+1)+" "+met[i]+"\nIts return type is: "+met[i].getReturnType());
            }
            System.out.println();

            //access to feilds
            System.out.println("Feilds\n");

            Field feild[] = cls.getDeclaredFields();
            for(int i =0;i<feild.length;i++)
            {
                System.out.println("Feild "+(i+1)+" "+feild[i]+"\nIts return type is: "+feild[i].getType());
            }
            System.out.println();

            //invoking a method
            System.out.println("Invoking\n");
            for(int i =0;i< met.length;i++)
            {
                if(met[i].getName().indexOf("setSalary") != -1)
                {
                  met[i].invoke(per,2345.123);
                }
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
