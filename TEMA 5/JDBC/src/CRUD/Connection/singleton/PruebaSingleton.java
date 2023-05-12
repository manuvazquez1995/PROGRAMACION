/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD.Connection.singleton;

import java.sql.*;

/**
 *
 * @author mrnov
 */
public class PruebaSingleton {
    public static void main(String[] args) throws SQLException {
        
        Connection conn = EjemploSingletonMySQL.getConnection();
         if (conn != null) {
                    System.out.println("Conexión 1: Conexión a " + conn.getCatalog()+" satisfactoria");
        }
    }
    
}
