
package Project;
import java.sql.*;

/**
 *
 * @author jenis
 */
public class ConnectionProvider {
    public static Connection getCon()
    { 
        try
        {  Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/book_management_db","root","Jenish@3116"); 
        return con;
        }
        catch(Exception e)
        {
        System.out.println(e);
        return null;
                
        }
         
    }
    
  
}
