import java.util.*;


public class ScannerConLimpieza {
    public static void main(String[] args) {

        // Declaramos el objeto scanner
        Scanner lectura=new Scanner(System.in);
        // Variable para almacenar el nombre
        String miNombre="";

        // Variable para almacenar la edad
        int edad=0;
        // Ahora pedimos su edad y la guardamos en edad
        System.out.println("Escribe tu edad:");
        // Guardamos el número en la variable.
        edad=lectura.nextInt();

        /* Aquí el buffer, una vez almacenada la
         * edad en la variable edad va a contener
         * un caracter \n
         * así que antes de que lea lo que lo que
         * el usuario vaya a introducir por teclado
         * debemos hacer una limpieza de buffer
         * esto lo haremos de la siguiente manera:*/
       lectura.nextLine();

        // Una vez limpio el buffer pedimos el nombre
        System.out.println("Escribe tu nombre:");
        // Lo leemos y lo almacenamos en la variable miNombre.
        miNombre=lectura.nextLine();
        // y ahora si mostramos por pantalla los resultados
        System.out.println("Tu nombre es " + miNombre
                + " y tu edad es " + edad + " años.");
        // Mostramos que finalizó el programa
        System.out.println("Programa finalizado con éxito.");
        // y cerramos el objeto lectura para no consumir recursos
        lectura.close();
    }
    

}
