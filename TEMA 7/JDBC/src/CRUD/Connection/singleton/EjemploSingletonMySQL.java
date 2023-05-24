/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.Connection.singleton;

/**
 *
 * @author mrnovoa
 */
import java.sql.*;

public class EjemploSingletonMySQL {

    // Propiedades
    private static Connection conn = null;
    private String url;
    private String usuario;
    private String password;
 
    // Constructor
    private EjemploSingletonMySQL(){

        //String url = "jdbc:mysql://localhost:3307/bdinstituto";
        String url ="jdbc:mysql://localhost:3306/ventas?characterEncoding=latin1&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
        //String url = "jdbc:mysql://localhost:3306/ventas";
        String usuario = "root";
        String password = "abc123.";

        try{
            conn = DriverManager.getConnection(url, usuario, password);
        }
        catch(SQLException e){
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
    } // Fin constructor

    // Métodos
    public static Connection getConnection(){

        if (conn == null){
            new EjemploSingletonMySQL();
        }

        return conn;
    } // Fin getConnection   
    
    
}
