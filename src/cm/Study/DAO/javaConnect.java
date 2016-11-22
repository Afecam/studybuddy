
package cm.Study.DAO;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class javaConnect {
    public static Statement stm;
    public static ResultSet result;
    public static Connection conn;
    public static PreparedStatement pst;
    
    public static Connection openConnection() {
    
        //Register driver
        try{
            Class.forName("org.sqlite.JDBC");
            
            //Connect to database
            conn = DriverManager.getConnection("jdbc:sqlite:M:\\School\\Work\\StudyBuddy\\Database\\Study.SQLITE");
        }catch(SQLException e){
            System.out.println("Connection failuer: " + e);
        }catch(ClassNotFoundException cnfe){
            System.out.println("Unable to load driver: " + cnfe);
        } 
        return conn;
    }
    
    public static void closeConnection(){
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException sqle){
                System.out.println("Unable to close.");
            }
        }
    }
}
