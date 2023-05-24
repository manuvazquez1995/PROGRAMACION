package GUI.conectar;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    public static final String URL ="jdbc:mysql://localhost:3306/empresa?characterEncoding=latin1&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
    public static final String USER = "root";
    public static final String CLAVE = "root";
    
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}