package Cadenas;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_3 {

    /*
    3. Crea un programa que pida dos cadenas de texto y luego las muestre en orden alfabético
    (sin diferenciar entre mayúsculas y minúsculas).
     */
    public static void main(String[] args) throws IOException {

        // Pedimos las 2 cadenas.
        System.out.println("- Introduce la 1ª cadena: ");
        String cadena1 = bufferReader.leerString();
        System.out.println("- Introduce la 2ª cadena: ");
        String cadena2 = bufferReader.leerString();

        // Las ordenamos en orden alfabético sin tener en cuenta las mayúsculas o minúsculas.
        if(cadena1.compareToIgnoreCase(cadena2) < 0){ //<0 es para comprobar que la cadena1 empieza por una letra anterior que la letra inicial de la cadena2.
            System.out.println(cadena1);
            System.out.println(cadena2);
        }else{
            System.out.println(cadena2);
            System.out.println(cadena1);
        }

    }

}