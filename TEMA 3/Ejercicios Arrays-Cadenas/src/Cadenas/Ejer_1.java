package Cadenas;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_1 {

    /*
    1. Crea un programa que pida una cadena de texto y luego la muestre tanto en mayúsculas como en minúsculas.
     */
    public static void main(String[] args) throws IOException {

        //Pedimos una cadena de texto por teclado.
        System.out.println("- Introduce una cadena de texto: ");
        String cadena = bufferReader.leerString();

        //La convertimos toda la cadena en mayúsculas y en minúsculas y mostramos los 2 resultados.
        String cadenaMay = cadena.toUpperCase();
        String cadenaMin = cadena.toLowerCase();

        System.out.println(cadenaMay);
        System.out.println(cadenaMin);

    }

}