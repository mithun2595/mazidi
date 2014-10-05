
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Validate {
    private static Statement stm;
    public static boolean checkUser(String id,String pass)
    {
        boolean st=false;
        try{
        Class.forName("com.mysql.jdbc.Driver");
String connectionURL = "jdbc:mysql://localhost:3306/hospitalmanagement"; 
Connection connection = null; 


    ResultSet rs=null;
   String sql="";
   
   connection = DriverManager.getConnection(connectionURL,"root","12021995");
            PreparedStatement ps=connection.prepareStatement("select * from nurse where nid=? and npass=?");
            ps.setString(1,id);
            ps.setString(2,pass);
             rs=ps.executeQuery();
             st=rs.next();
             
             sql="select dno from nurse where nid='"+id+"';";
             stm=connection.createStatement();
		stm.executeUpdate(sql);
            
        }
        catch(Exception e)
        {
            
        }
        return st;
    }
}
