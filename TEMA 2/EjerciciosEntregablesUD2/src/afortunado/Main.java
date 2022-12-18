package afortunado;
import bufferedReader.*;
import java.io.IOException;

/* EJERCICIO 1:
   Según ciera cultura oriental.
        - Los números de la suerte son el 3, el 7, el 8 y el 9.
        - Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6.
   Un número es afortunado si contiene más números de la suerte que de la mala suerte.

   Realiza un programa que diga si un número introducido por el usuario es afortunado o no.
   Se visualizará un menú con 3 apartados:
        - Introducir número
        - Valorar número
        - Salir
*/

public class Main {

    public static void main(String[] args) throws IOException {
        /* TODO: El siguiente método estático muestra el menú con sus opciones y funcionalidades.
        *   Está en la clase afortunado. */

        afortunado.menu();

    }

}