package Expresiones_Regulares;
import metodosReutilizables.bufferReader;
import java.io.IOException;

public class Ejer_3 {

    // 3. Valida si una cadena es un DNI: 8 numeros y una letra al final.

    public static void main(String[] args) throws IOException {

        System.out.println("- Introduce un DNI:");
        String dni = bufferReader.leerString();

        if(validaciones.validarDNI(dni)){
            System.out.println("DNI válido.");
        }else{
            System.out.println("DNI NO válido.");
        }


    }

}