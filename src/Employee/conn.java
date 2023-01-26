package Employee;

import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            System.out.println("Connecting to database...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///UserDatabase","root","nilay123");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }


}
