package librosautoresmultiplescon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import metodos.Altas;
import metodos.Conexion;
import metodos.Consultas;
import metodos.Creacion;
import metodos.Menu;

/**
 *
 * @author 
 */
public class LibrosAutoresMultiplesCon {

    public static Statement sentencia;
    public static ResultSet res;

    public static void main(String[] args) {
        int opcion, opcionsub, bd = 1;
        Connection conn = null;
        do {
            opcion = Menu.menuPrincipal();
            switch (opcion) {
                case -1:
                    System.out.println("Debe introducir un numero.");

                    break;
                case 1:
                    bd = Menu.menuBD();
                    conn = Conexion.conexion(conn, bd);
                    break;
                case 2:
                    Creacion.crearMenu(conn, sentencia, bd);
                    break;
                case 3:
                    do {
                        opcionsub = Menu.menuAltas();
                        switch (opcionsub) {
                            case -1:
                                System.out.println("Debe introducir un numero.");
                                break;
                            case 1:
                                Altas.altasAutor(conn, sentencia);
                                break;
                            case 2:
                                Altas.altasLibro(conn, sentencia);
                                break;
                            case 3:
                                Altas.altasRelacion(conn, sentencia, res);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Las opciones van de 0-3.");
                                break;
                        }
                    } while (opcionsub != 0);
                    break;
                case 4:
                    do {
                        opcionsub = Menu.menuConsultas();
                        switch (opcionsub) {
                            case -1:
                                System.out.println("Debe introducir un numero.");
                                break;
                            case 1:
                                Consultas.consultarLibro(conn, sentencia, res);
                                break;
                            case 2:
                                Consultas.consultarAutor(conn, sentencia, res);
                                break;
                            case 3:
                                Consultas.visualizarAutores(conn, sentencia, res);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Las opciones van de 0-3.");
                                break;
                        }
                    } while (opcionsub != 0);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Las opciones van de 0-4");
                    break;
            }
        } while (opcion != 0);
    }

}
