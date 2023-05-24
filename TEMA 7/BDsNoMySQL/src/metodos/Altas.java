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
public class Altas {

    public static void altasAutor(Connection conn, Statement sentencia) {
        Scanner scan = new Scanner(System.in);
        String nombre, nacionalidad;
        try {
            sentencia = conn.createStatement();
            System.out.println("Introduce el nombre del autor.");
            System.out.print(" > ");
            nombre = scan.nextLine();
            System.out.println("Introduce la nacionalidad de autor.");
            System.out.print(" > ");
            nacionalidad = scan.nextLine();
            sentencia.executeUpdate("insert into autores (nombre,nacionalidad) "
                    + "values('" + nombre + "','" + nacionalidad + "')");
            System.out.println("Añadido.\n");
        } catch (SQLException e) {
            System.out.println("Error: " + e);

        }
    }

    public static void altasLibro(Connection conn, Statement sentencia) {
        Scanner scan = new Scanner(System.in);
        String titulo;
        float precio;
        try {
            sentencia = conn.createStatement();
            System.out.println("Introduce el titulo del libro.");
            System.out.print(" > ");
            titulo = scan.nextLine();
            System.out.println("Introduce precio del libro.");
            System.out.print(" > ");
            precio = scan.nextFloat();
            sentencia.executeUpdate("insert into libros (titulo,precio) "
                    + "values('" + titulo + "'," + precio + ")");
            System.out.println("Añadido.\n");
        } catch (SQLException e) {
            System.out.println("Error: " + e);

        }
    }

    public static void altasRelacion(Connection conn, Statement sentencia, ResultSet res) {
        Scanner scan = new Scanner(System.in);
        int codL, codA;
        try {
            sentencia = conn.createStatement();
            res = sentencia.executeQuery("select * from autores");
            if (res.next()) {
                System.out.println(String.format("%1$-32s %2$s", "Codigo: ", "Nombre: "));
                do {
                    System.out.println(String.format("%1$-32s %2$s", res.getString(1), res.getString(2)));
                } while (res.next());
                System.out.println("Introduce el codigo del autor.");
                System.out.print(" > ");
                codA = scan.nextInt();
                res = sentencia.executeQuery("select * from libros");
                if (res.next()) {
                    System.out.println(String.format("%1$-32s %2$s", "Codigo: ", "Titulo: "));
                    do {
                        System.out.println(String.format("%1$-32s %2$s", res.getString(1), res.getString(2)));
                    } while (res.next());
                    System.out.println("Introduce el codigo del libro.");
                    System.out.print(" > ");
                    codL = scan.nextInt();
                    sentencia.executeUpdate("insert into librosautores values("+codA+","+codL+")");
                    System.out.println("Añadida.");
                } else {
                    System.out.println("No hay libros.");
                }
            } else {
                System.out.println("No hay autores.");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
}
