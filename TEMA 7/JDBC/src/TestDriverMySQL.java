import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestDriverMySQL {

    public static void main(String[] args) {

        // conexiones
        Connection conexion1 = null;
        Connection conexion2 = null;
        Connection conexion3 = null;

        // usuario y clave
        String user = "root";
        String password = "abc123.";
        String mibase = "ventas";
        try {
            // una sola cadena de conexión, en un sólo parámetro se concatena el
            // usuario y el password
            String url1 = "jdbc:mysql://localhost:3306/" + mibase + "?useSSL=false&serverTimezone=UTC&user=" + user + "&password=" + password;
            conexion1 = DriverManager.getConnection(url1);
            if (conexion1 != null) {
                    System.out.println("Conexión 1: Conexión a mibase satisfacoria");
            }

            // se envía la cadena y los datos de usuario y password por separado
            Properties datos = new Properties();
            datos.put("root", user);
            datos.put("abc123.", password);
            String url2 = "jdbc:mysql://localhost:3306/" + mibase+ "?useSSL=false&serverTimezone=UTC";
            conexion2 = DriverManager.getConnection(url2, datos.getProperty(user),datos.getProperty(password));
            if (conexion2 != null) {
                    System.out.println("Conexión 2: Conexión a mibase satisfacoria");
            }

            // se envía la cadena, el usuario y el password por separado
            String url3 = "jdbc:mysql://localhost:3306/" + mibase+ "?useSSL=false&serverTimezone=UTC";
            conexion3 = DriverManager.getConnection(url3, user, password);
            if (conexion3 != null) {
                    System.out.println("Conexión 3: Conexión a mibase satisfacoria");
            }
        } catch (SQLException e) {
            System.out.println(
                            "Error en la conexión, verifique, su usuario y password o el nombre de la base a la que intenta conectarse");
            e.printStackTrace();
        }
    }
}