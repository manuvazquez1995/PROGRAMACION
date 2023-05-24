package metodos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 
 */
public class Creacion {

    public static Statement crearMenu(Connection conn, Statement sentencia, int op) {
        try {
            sentencia = conn.createStatement();
            switch (op) {
                case 1:
                    crearSQLite(sentencia);
                    break;
                case 2:
                    crearDerby(sentencia);
                    break;
                case 3:
                    crearH2(sentencia);
                    break;
                case 4:
                    crearHSQLdb(sentencia);
                    break;
                case 5:
                    crearOracle(sentencia);
                    break;
                case 6:
                    break;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return sentencia;
    }

    public static void crearSQLite(Statement sentencia) {
        try {

            sentencia.execute("CREATE TABLE libros (\n"
                    + " idLibro  integer NOT NULL PRIMARY KEY autoincrement,\n"
                    + " titulo   VARCHAR(30), \n"
                    + " precio   float(6,2)\n"
                    + ");");

            sentencia.execute("CREATE TABLE autores ("
                    + " idautor   INTeger  NOT NULL PRIMARY KEY autoincrement ,\n"
                    + " nombre    VARCHAR(20),\n"
                    + " nacionalidad    VARCHAR(30));");

            sentencia.execute("CREATE TABLE librosautores("
                    + "autor integer not null  references autores(idautor),"
                    + "libro integer not null  references libros(idlibro),"
                    + "primary key(autor,libro));");

            System.out.println("- TABLAS CREADAS -");

            sentencia.close();

        } catch (SQLException e) {
            //System.out.println(e);
            System.out.println("LAS TABLAS YA EXISTEN");
            // System.out.println(e.getMessage());
        }
    }

    public static void crearDerby(Statement sentencia) {
        // INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)
        try {

            sentencia.execute("CREATE TABLE libros (\n"
                    + " idLibro  INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),\n"
                    + " titulo   VARCHAR(30), \n"
                    + " precio   float,\n"
                    + "constraint primary_key_lib primary key(idlibro)"
                    + ")");

            sentencia.execute("CREATE TABLE autores ("
                    + " idautor   INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),\n"
                    + " nombre    VARCHAR(20),\n"
                    + " nacionalidad    VARCHAR(30),"
                    + "constraint primary_key_aut primary key(idautor))");

            sentencia.execute("CREATE TABLE librosautores("
                    + "autor integer not null  references autores(idautor),"
                    + "libro integer not null  references libros(idlibro),"
                    + "primary key(autor,libro))");

            System.out.println("- TABLAS CREADAS -");

            sentencia.close();

        } catch (SQLException e) {
            //System.out.println(e);
            System.out.println("LAS TABLAS YA EXISTEN");
            // System.out.println(e.getMessage());
        }
    }

    public static void crearH2(Statement sentencia) {
        try {

            sentencia.execute("CREATE TABLE libros (\n"
                    + " idLibro  int NOT NULL PRIMARY KEY auto_increment,\n"
                    + " titulo   VARCHAR(30), \n"
                    + " precio   float\n"
                    + ");");

            sentencia.execute("CREATE TABLE autores ("
                    + " idautor   INTeger  NOT NULL PRIMARY KEY auto_increment,\n"
                    + " nombre    VARCHAR(20),\n"
                    + " nacionalidad    VARCHAR(30));");

            sentencia.execute("CREATE TABLE librosautores("
                    + "autor integer not null  references autores(idautor),"
                    + "libro integer not null  references libros(idlibro),"
                    + "primary key(autor,libro));");

            System.out.println("- TABLAS CREADAS -");

            sentencia.close();

        } catch (SQLException e) {
            //System.out.println(e);
            System.out.println("LAS TABLAS YA EXISTEN");
            // System.out.println(e.getMessage());
        }
    }

    public static void crearHSQLdb(Statement sentencia) {
        try {

            sentencia.execute("CREATE TABLE libros (\n"
                    + " idLibro  int NOT NULL identity,\n"
                    + " titulo   VARCHAR(30), \n"
                    + " precio   float\n"
                    + ");");

            sentencia.execute("CREATE TABLE autores ("
                    + " idautor   INTeger  NOT NULL identity,\n"
                    + " nombre    VARCHAR(20),\n"
                    + " nacionalidad    VARCHAR(30));");

            sentencia.execute("CREATE TABLE librosautores("
                    + "autor integer not null  references autores(idautor),"
                    + "libro integer not null  references libros(idlibro),"
                    + "primary key(autor,libro));");

            System.out.println("- TABLAS CREADAS -");

            sentencia.close();

        } catch (SQLException e) {
            //System.out.println(e);
            System.out.println("LAS TABLAS YA EXISTEN");
            // System.out.println(e.getMessage());
        }
    }

    public static void crearOracle(Statement sentencia) {
         try {

            sentencia.execute("CREATE TABLE libros (\n"
                    + " idLibro  number(11) NOT NULL generated always as identity,\n"
                    + " titulo   VARCHAR(30), \n"
                    + " precio   float\n"
                    + ");");

            sentencia.execute("CREATE TABLE autores ("
                    + " idautor   number(11)  NOT NULL generated always as identity,\n"
                    + " nombre    VARCHAR(20),\n"
                    + " nacionalidad    VARCHAR(30));");

            sentencia.execute("CREATE TABLE librosautores("
                    + "autor number(11) not null  references autores(idautor),"
                    + "libro number(11) not null  references libros(idlibro),"
                    + "primary key(autor,libro));");

            System.out.println("- TABLAS CREADAS -");

            sentencia.close();

        } catch (SQLException e) {
            //System.out.println(e);
            System.out.println("LAS TABLAS YA EXISTEN");
            // System.out.println(e.getMessage());
        }
    }
}
