package Cadenas;
import metodosReutilizables.*;

import java.io.IOException;

public class Ejer_2 {

    /*
    2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales o no,
    además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
    */
    public static void main(String[] args) throws IOException {

        // Pedimos las 2 cadenas.
        System.out.println("- Introduce la 1ª cadena: ");
        String cadena1 = bufferReader.leerString();
        System.out.println("- Introduce la 2ª cadena: ");
        String cadena2 = bufferReader.leerString();

        //Comparamos si las 2 cadenas son iguales, sin importar las mayúsculas o minusculas.
        if(cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("Las 2 cadenas son iguales.");
        }else{
            System.out.println("Las 2 cadenas NO son iguales.");
        }

    }

}