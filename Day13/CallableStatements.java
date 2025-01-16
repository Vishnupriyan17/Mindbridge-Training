package Day13;

import java.sql.*;
import java.sql.CallableStatement;

public class CallableStatements {
    public static void selectStudent() {
        Connection connection = null;
        CallableStatement cstat = null;
        ResultSet rs = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/Mindbridges", "root", "Vishnu@2003");
            cstat = connection.prepareCall("{call oneprocedure(?,?,?)}");
            cstat.setDouble(1, 21);
            cstat.setDouble(3, 88.7);
            cstat.registerOutParameter(2,Types.VARCHAR);
            cstat.registerOutParameter(3,Types.DOUBLE);
            cstat.execute();
            cstat.getString(2);
            cstat.getDouble(3);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (connection != null)
                    connection.close();
                if (cstat != null)
                    cstat.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {

    }
}
