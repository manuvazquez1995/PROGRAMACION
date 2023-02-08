package Cadenas;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_4 {

    /*
    4. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
    Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de las
    tres primeras letras de cada uno de ellos.
     */
    public static void main(String[] args) throws IOException {

        // Declaramos el código del usuario.
        String codUsuario;

        // Pedimos las 3 cadenas (un nombre y los 2 apellidos).
        System.out.println("- Introduce el nombre: ");
        String nombre = bufferReader.leerString();
        System.out.println("- Introduce el 1º apellido: ");
        String apellido1 = bufferReader.leerString();
        System.out.println("- Introduce el 2º apellido: ");
        String apellido2 = bufferReader.leerString();

        // Generamos el código a partir de las 3 primeras letras del nombre y de cada apellido en mayúsculas.
        codUsuario = nombre.substring(0,3);
        codUsuario += apellido1.substring(0,3);  // El += es para ya concatenar con lo que ya está guardado en codUsuario.
        codUsuario += apellido2.substring(0,3);
        codUsuario = codUsuario.toUpperCase();

        // Mostramos el código del usuario generado.
        System.out.println("- CODIGO:  "+codUsuario);

    }

}