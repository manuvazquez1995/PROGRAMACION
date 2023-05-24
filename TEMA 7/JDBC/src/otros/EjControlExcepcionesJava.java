package otros;

import java.io.*;
import java.sql.*;

/**
 *
 * @author 
 */
public class EjControlExcepcionesJava {

    public static void main(String[] args) {
 
        try (
              
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemploscript?useSSL=false&serverTimezone=UTC&user=root&password=root");
            PreparedStatement sInsert = conexion.prepareStatement("INSERT INTO ALUMNOS (CODIGO, NOMBRE) VALUES (?,?);")) {
            int i=1;
            sInsert.setInt(i++, 2);
            sInsert.setString(i++, "nuevoAlumno2");

            sInsert.executeUpdate();
                 
        } catch (SQLException e) {
              muestraErrorSQL(e);
            } catch (Exception e) {
              e.printStackTrace(System.err);
            }
    }    

    public static void muestraErrorSQL(SQLException e) {
        System.err.println("SQL ERROR mensaje: " + e.getMessage());
        System.err.println("SQL Estado: " + e.getSQLState());
        System.err.println("SQL codigo especifico: " + e.getErrorCode());

    }
}