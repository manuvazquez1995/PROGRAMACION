package Expresiones_Regulares;
import metodosReutilizables.bufferReader;
import java.io.IOException;

public class Ejer_2 {

    // 2. Valida si una cadena  es un numero real (positivo o negativo) con un numero de decimales.

    public static void main(String[] args) throws IOException {

        System.out.println("Introduce un número: ");
        String n = bufferReader.leerString();

        if(validaciones.validarNumReal(n)){
            System.out.println("ES REAL");
        }else{
            System.out.println("NO ES REAL");
        }

    }



}
