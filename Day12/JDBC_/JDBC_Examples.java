package JDBC_;

import java.sql.*;
import java.util.Scanner;

public class JDBC_Examples {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            String url="jdbc:mysql://localhost:3306/Student";
            String userName="root";
            String password="vishnu17";
            String query="insert into Student_Details values(?,?,?)";
            Connection connection=DriverManager.getConnection(url,userName,password);
            PreparedStatement stmt=connection.prepareStatement(query);

//          insert
            int n=sc.nextInt();
            System.out.println("Enter no of students to insert : ");
            while (n!=0){
                int id=sc.nextInt();
                String name=sc.next();
                int mark= sc.nextInt();
                stmt.setInt(1,id);
                stmt.setString(2,name);
                stmt.setInt(3,mark);
                int count=stmt.executeUpdate();
                System.out.println("Rows affected : "+count);
                n--;
            }

//            display

            query="select * from Student_Details";
            Statement stmt1=connection.createStatement();
            ResultSet rs=stmt1.executeQuery(query);

            while (rs.next()){
                System.out.println("Id : "+rs.getInt(1));
                System.out.println("Name : "+rs.getString(2));
                System.out.println("Mark : "+rs.getInt(3));
            }
            connection.close();
            stmt.close();
            stmt1.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
