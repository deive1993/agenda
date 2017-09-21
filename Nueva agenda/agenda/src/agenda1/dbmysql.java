package agenda1;

 
import java.sql.Connection;
import java.sql.DriverManager; //Clase maestra que nos permite tomar el servidor
import javax.swing.JOptionPane;




public class dbmysql {
    private static String db = "agenda";
    private static String user = "root";
    private static String pass = "";
    private static String url = "jdbc:mysql://localhost:3306/"+db;
    private static Connection conn;
    
public static Connection getConnect () {
    try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection (url,user,pass);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            }
    return conn;
    }

}
