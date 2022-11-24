import java.util.*;


public class Main {
    public static void main(String[] args) {
        String lineaNombre = null;
        String lineaLenguaje = null;

        Scanner sc = new Scanner(System.in);

        Programador programador1 = new Programador();

        /* Input */
        System.out.println("Escribe el nombre del programador: ");
        programador1.nombre = sc.nextLine();

        System.out.println("Lenguaje con el que programa: ");
        programador1.lenguaje = sc.nextLine();

        /* Output */
        //System.out.println("El programador se llama: "+lineaNombre);
        //System.out.println("Programa en: "+lineaNombre);

        //System.out.println("El programador se llama "+programador1.nombre);
        //System.out.println("Programa en: "+programador1.lenguaje);

        System.out.println(programador1.toString());

    }

}