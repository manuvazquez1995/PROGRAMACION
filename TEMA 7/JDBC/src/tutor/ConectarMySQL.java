package tutor;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectarMySQL {

    public static void main(String[] args) {

        testMySQLDriver();//No es necesario en la versión usada
        
        try {

            String db ="jdbc:mysql://localhost:3306/empresa?characterEncoding=latin1&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";

            //String url = "jdbc:mysql://localhost:3306/empresa?useSSL=false";
            String username = "root";
            String password = "root";

            Connection connection = DriverManager.getConnection(db, username, password);

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM empregados");

            System.out.println(String.format("%s, %s, %s, %s", "DNI      ", "nombre      ", "cat.  ", "depto. "));
            while (rs.next()) {

                String id = rs.getString("NIFE");
                String nombre = rs.getString("NomeE");
                String categoria = rs.getString("IdCateE");
                //Date fecha = rs.getDate("fecha");
                String departamento = rs.getString("IdDepaE");

                System.out.println(String.format("%s, %s, %s, %s", id, nombre, categoria, departamento));
            }

            rs.close();
            statement.close();
            connection.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private static void testMySQLDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.out.println("Error, no se ha podido cargar MySQL JDBC Driver");
        }
    }

}
