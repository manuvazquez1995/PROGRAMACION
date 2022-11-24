//Se pide por teclado un número y que a continuación escriba el mensaje "el
//número leído es positivo" o bien el mensaje "el número leído es negativo"
//dependiendo de que el número sea positivo o negativo. Consideramos al
//número cero positivo.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Declaramos e inicializamos las variables, también los scanner.
         String r;
         int num;

         Scanner leerNum = new Scanner(System.in);

         //Leemos por teclado.
        System.out.println("Introduce un numero: ");
        num = leerNum.nextInt();

        // Procedimiento.
        if(num >= 0){
            r = "El numero leido es positivo.";

        }else{
            r = "El numero leido es negativo.";

        }

        // Mostramos el resultado.
        System.out.println("*****************************");
        System.out.println(r);

    }

}