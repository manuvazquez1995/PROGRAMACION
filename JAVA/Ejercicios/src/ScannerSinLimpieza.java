import java.util.*;

public class ScannerSinLimpieza {

    public static void main(String[] args) {

        // Declaramos el objeto scanner
        Scanner lectura=new Scanner(System.in);

        // Variable para almacenar el nombre
        String miNombre="";

        // Variable para Almacenar la edad
        int edad=0;
        // Ahora pedimos su edad y la guardamos en edad
        System.out.println("Escribe tu edad:");
        /* Hasta aquí, declaramos dos variables y les
         * damos un valor inicial.*/
        // Pedimos la edad y lógicamente la tecleamos
        /* Para enviarla a la variable, primero se almacena
         * en un buffer*/

        edad=lectura.nextInt();
        /* Cuando llega a esta instrucción, envia el número 25
         * quedándose con el caracter \n en su interior.*/

        /* La ejecución del programa sigue y muestra este mensaje
         * hasta aquí todo bien.*/
        System.out.println("Escribe tu nombre:");

        miNombre = lectura.nextLine();
        /* Pero ¿Por qué no se para aquí para teclear el nombre?*/
        /*
         * Esto es debido a que cuando el enviamos un dato a una variable primero pasa por el buffer y el buffer tiene
         * que estar vacío para poder recibir nuevos datos. En este caso el buffer tiene un caracter “\n” almacenado.
         * Lo que significa que está almacenando un salto de linea provocado por la pulsación del ENTER.
         * Esto para el buffer de java es considerado de tipo de dato String, es decir, un tipo texto.
         * Por ese motivo al invocar al método nextline(); en la variable miNombre almacena un caracter en blanco.
         * Esto es porque está leyendo el salto de línea que esta almacenado en dicho buffer.*/
        /* Y a la hora de mostrar el mensaje, no imprime
         * la variable nombre porque realmente lo que hay
         * dentro de esa variable es el símbolo \n */
        System.out.println("Tu nombre es " + miNombre
                + " y tu edad es " + edad + " años.");
        // Mostramos que finalizó el programa
        System.out.println("Programa finalizado con éxito.");
    }

}
