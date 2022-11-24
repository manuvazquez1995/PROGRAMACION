/*Hacer un programa que pida por teclado dos números y que calcule y escriba su
suma, solamente si los dos son pares y el primero es menor que 50 y el
segundo está dentro del intervalo cerrado 100-500. En caso de que no se
cumpla las condiciones, en vez de la suma, visualizar un mensaje de error*/

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Declaramos e inicializamos las variables junto a los escaneres.
        int n1;
        int n2;
        int suma;
        n1 = 0;
        n2 = 0;
        suma = 0;

        Scanner teclado = new Scanner(System.in);

        //Leemos los números por teclado.
        System.out.println("Introduzca el primer número: ");
        n1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca el segundo número: ");
        n2 = teclado.nextInt();
        teclado.nextLine();

        // Proceso donde también mostramos los datos de salida.
        if((n1<50) && ((n2>=50) && (n2<=500))){
            if((n1 % 2 == 0) && (n2 % 2 == 0)){
                suma = n1 + n2;
                System.out.println("La suma es: "+suma);

            }else{
                System.out.println("Error, algún o algunos de los nº introducidos no cumplen la condición.");

            }

        }else{
            System.out.println("Error, algún o algunos de los nº introducidos no cumplen la condición.");

        }

        teclado.close();;
    }

}