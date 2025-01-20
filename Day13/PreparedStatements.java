package Day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class PreparedStatements {
    public static void selectStudent()
    {
        Connection connection = null;
        PreparedStatement pstat = null;
        ResultSet rs = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/Mindbridges", "root", "Vishnu@2003");
            pstat = connection.prepareStatement("select StudentName from Student where Marks >= ?");
            pstat.setDouble(1,95);
            rs = pstat.executeQuery();
            while (rs.next())
            {
                System.out.println(rs.getString("StudentName"));
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
                if(pstat != null)
                    pstat.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        selectStudent();
    }
}
