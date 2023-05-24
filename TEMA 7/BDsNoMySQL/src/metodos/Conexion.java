package metodos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 
 */
public class Conexion {

    public static Connection conexion(Connection conn, int opcion) {
        String ruta = "./BD/";
        try {
            switch (opcion) {
                case 1: //sqlite
                    conn = DriverManager.getConnection("jdbc:sqlite:" + ruta + "librosSqlite.db");
                    System.out.println("Conectado con SQLite");
                    break;
                case 2: //derby
                    conn = DriverManager.getConnection("jdbc:derby:" + ruta + "librosApache;create=true");
                    System.out.println("Conectado con Apache Derby");
                    break;
                case 3: //h2
                    conn = DriverManager.getConnection("jdbc:h2:" + ruta + "librosH2");
                    System.out.println("Conectado con H2");
                    break;
                case 4://hsqldb
                    conn = DriverManager.getConnection("jdbc:hsqldb:file:" + ruta + "librosHSQLdb");
                    System.out.println("Conectado con HSQLdb");
                    break;
                case 5://oracle
                    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "Abcd1234");
                    System.out.println("Conectado con OracleDb");
                    break;
                default:
                    System.out.println("No se ha conectado");
                    break;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return conn;
    }
}
