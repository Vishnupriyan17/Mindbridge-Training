package Day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;

public class Batching {
    public static void insertBatch()
    {
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/Mindbridges", "root", "Vishnu@2003");
            statement = connection.createStatement();
            String sql = "insert into Student values (4,'Gogul',75.6)";
            statement.addBatch(sql);
            String sql1 = "insert into Student values (5,'Adams',88.6)";
            statement.addBatch(sql1);
            int i[] = statement.executeBatch();
            System.out.println(Arrays.toString(i));
        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            try{
                if(connection != null)
                    connection.close();
                if(statement != null)
                    statement.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        insertBatch();
    }
}
