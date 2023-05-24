package metodos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Consultas {

    public static void consultarLibro(Connection conn, Statement sentencia, ResultSet res) {
        Scanner scan = new Scanner(System.in);
        int codigo, contador = 0;
        try {
            sentencia = conn.createStatement();
            res = sentencia.executeQuery("select idlibro,titulo from libros");
            System.out.println(String.format("%1$-32s %2$s", "Codigo: ", "Titulo: "));
            while (res.next()) {
                System.out.println(String.format("%1$-32s %2$s", res.getString(1), res.getString(2)));
            }
            System.out.println("Introduce el codigo del libro a consultar");
            codigo = scan.nextInt();
            res = sentencia.executeQuery("select * from libros where idlibro=" + codigo + "");
            if (!res.next()) {
                System.out.println("No existe el libro");
            } else {
                res = sentencia.executeQuery("select l.idlibro,l.titulo,l.precio,a.nombre "
                        + "from libros as l inner join librosautores as la "
                        + "on l.idlibro = la.libro "
                        + "inner join autores as a "
                        + "on a.idautor = la.autor "
                        + "where l.idlibro=" + codigo + "");
                while (res.next()) {
                    if (contador > 0) {
                        System.out.print(", " + res.getString("nombre"));
                    } else {
                        System.out.print("Codigo: " + res.getString("idlibro") + "\tTitulo: " + res.getString("titulo")
                                + "\t\tPrecio: " + res.getFloat("precio") + "\tAutor/es: " + res.getString("nombre"));
                        contador++;
                    }
                }
            }
            System.out.println();
        } catch (SQLException e) {
            System.out.println("Error " + e);

        }
    }

    public static void consultarAutor(Connection conn,Statement sentencia, ResultSet res) {
        Scanner scan = new Scanner(System.in);
        int codigo;
        try {
            sentencia = conn.createStatement();
            res = sentencia.executeQuery("select idautor,nombre from autores");
            System.out.println(String.format("%1$-32s %2$s", "Codigo: ", "Nombre: "));
            while (res.next()) {
                System.out.println(String.format("%1$-32s %2$s", res.getString(1), res.getString(2)));
            }
            System.out.println("Introduce el ID de autor");
            codigo = scan.nextInt();
            scan.nextLine();
            res = sentencia.executeQuery("select * from autores where idautor=" + codigo + "");
            if (!res.next()) {
                System.out.println("El autor introducido no existe");
            } else {
                System.out.println("Libro:\t\t\t\tPrecio:");
                res = sentencia.executeQuery("select l.titulo ,l.precio "
                        + "from libros as l inner join librosautores "
                        + "on l.idlibro = libro "
                        + "where autor =" + codigo + "");
                while (res.next()) {
                    System.out.println(String.format("%1$-31s %2$s", res.getString("titulo"), res.getString("precio")) + "€");
                }
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Error " + e);
        }

    }

    /*public static void visualizarLibros(Statement sentencia, ResultSet res) {
        try {
            res = sentencia.executeQuery("select idlibro,titulo,precio from libros;");
            System.out.println("Codigo\t\t\tTitulo\t\t\tPrecio");
            while (res.next()) {
                System.out.println(String.format("%1$-23s %2$-23s %3$s", res.getString("idlibro"), res.getString("titulo"), res.getString("precio")) + "€");
            }
            System.out.println();
        } catch (SQLException e) {
            System.out.println("Error " + e);
        }
    }*/

    public static void visualizarAutores(Connection conn,Statement sentencia, ResultSet res) {
        String id, lastid = null;
        try {
            sentencia=conn.createStatement();
            res = sentencia.executeQuery("select a.idautor,a.nombre,a.nacionalidad,l.titulo,l.precio "
                    + "from autores as a inner join librosautores as la "
                    + "on a.idautor = la.autor "
                    + "inner join libros as l "
                    + "on l.idlibro=libro");
            while (res.next()) {
                id = res.getString("idautor");
                if (!id.equals(lastid)) {
                    System.out.println(String.format("%1$-32s %2$s", "\nAutor: " + res.getString("nombre"), "Nacionalidad: " + res.getString("nacionalidad")));
                    System.out.println("Titulo\t\t\t\tPrecio");
                }
                System.out.println(String.format("%1$-31s %2$s", res.getString("titulo"), res.getString("precio")));
                lastid = id;
            }
            System.out.println();
        } catch (SQLException e) {
            System.out.println("Error " + e);
        }
    }
}
