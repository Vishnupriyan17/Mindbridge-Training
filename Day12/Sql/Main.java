package Day12.Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void insertStudent()
    {
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/Mindbridges", "root", "Vishnu@2003");
            statement = connection.createStatement();
            String sql = "insert into Student values (1,'Shaym',95.6)";
            int i = statement.executeUpdate(sql);

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
    public static void selectStudent()
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/Mindbridges", "root", "Vishnu@2003");
            statement = connection.createStatement();
            String sql = "select * from Student";
            rs = statement.executeQuery(sql);
            while (rs.next())
            {
                System.out.println(rs.getInt("RollNumber"));
                System.out.println(rs.getString(2));
                System.out.println(rs.getDouble(3));
                System.out.println("---------------------------");
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            try{
                if(rs !=  null)
                    rs.close();
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
//        insertStudent();
        selectStudent();
    }
}
