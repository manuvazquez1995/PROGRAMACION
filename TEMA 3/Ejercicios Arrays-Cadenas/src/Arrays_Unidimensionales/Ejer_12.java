package Arrays_Unidimensionales;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_12 {

    /* 12. Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:
            ◦ a. Mostrar valores.
            ◦ b. Introducir valor.
            ◦ c. Salir. */
    public static void main(String[] args) throws IOException {

        //Creamos el array.
        int[] vector = new int[10];

        //Menú del programa.
        String op = "d"; //Valor por defecto solo al empezar el programa.
        do{
            opMenu();
            System.out.println("Introduce una opción:");
            op = bufferReader.leerString();
            while(op!="a"|op!="b"|op!="c"){
                System.err.println("- Opción incorrecta.");
                System.out.println("- Introduce una opción válida: ");
                opMenu();
                op = bufferReader.leerString();
            }

        }while(op!="c");




    }

    public static void opMenu(){
        System.out.println("""
                - MENU:\s
                (a) Mostrar valores
                (b) Introducir valores
                (c) Salir""");
    }


}