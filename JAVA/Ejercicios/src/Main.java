import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Definimos variables.
        short numero;

        //Datos de entrada.
        Scanner num = new Scanner(System.in);
        System.out.println("Introducir numero: ");
        numero = num.nextShort();
        System.out.println("El numero es: "+numero);

        //Proceso y datos de salida.
        System.out.println("DOBLE: "+numero*2);
        System.out.println("TRIPLE: "+numero*3);

    }

}