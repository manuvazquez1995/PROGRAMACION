package metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Menu {

    public static int menuPrincipal() {

        byte op;
        System.out.println("1.Conectarse a una BD."
                + "\n2.Creación de Tablas."
                + "\n3.Altas."
                + "\n4.Consultas."
                + "\n0.Salir.");

        try {
            return new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            return -1;
        }
    }

    public static int menuBD() {

        byte op;
        System.out.println("1.Conectarse a SQLite."
                + "\n2.Conectarse a Apache Derby."
                + "\n3.Conectarse a H2."
                + "\n4.Conectarse a HSQLDB."
                + "\n5.Conectarse a Oracle DB."
                + "\n0.Salir.");

        try {
            return new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            return -1;
        }
    }
    
    public static int menuAltas(){
        byte op;
        System.out.println("1.Altas autor."
                + "\n2.Altas libro."
                + "\n3.Altas relacion."
                + "\n0.Salir.");

        try {
            return new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            return -1;
        }
    }
    
    public static int menuConsultas(){
        byte op;
        System.out.println("1.Datos Libro."
                + "\n2.Consultar autor."
                + "\n3.Lista autores."
                + "\n0.Salir.");

        try {
            return new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            return -1;
        }
    }

}
