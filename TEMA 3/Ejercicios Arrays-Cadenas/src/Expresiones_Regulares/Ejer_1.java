package Expresiones_Regulares;
import metodosReutilizables.*;
import java.io.IOException;

public class Ejer_1 {

   // 1. Valida si una cadena es un numero entero (positivo/negativo)

    public static void main(String[] args) throws IOException {

        System.out.println("Introduce un número: ");
        String n = bufferReader.leerString();

        if(validaciones.validarNumEntero(n)){
            System.out.println("ENTERO");
        }else{
            System.out.println("NO ES ENTERO");
        }


    }


}