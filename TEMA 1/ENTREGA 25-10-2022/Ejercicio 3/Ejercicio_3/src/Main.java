// Modificar el ejercicio anterior para que en vez de escribir un mensaje genérico
// en caso de que alguno o los dos números sean negativos, escriba una
// salida diferenciada para cada una de las situaciones que se pueden producir
// utilizando los siguientes mensajes:
// - No se calcula la suma porque el primer número es negativo.
// - No se calcula la suma porque el segundo número es negativo.
// - No se calcula la suma porque los dos números son negativos.

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaramos e inicializamos las variables junto a los escaneres.
        int num1;
        int num2;
        int suma;
        num1 = 0;
        num2 = 0;
        suma = 0;

        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);

        // Leemos los números por teclado.
        System.out.println("Introduce el primer numero: ");
        num1 = n1.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = n2.nextInt();

        //Proceso donde también mostramos los datos de salida.
        if((num1<0) | (num2<0)){
            System.out.println("Numeros introducidos: "+num1+", "+num2);

            if((num1<0) & (num2<0)){
                System.out.println("No se calcula la suma porque los dos números son negativos.");

            }else{

                if((num1<0) & (num2>0)){
                    System.out.println("No se calcula la suma porque el primer número es negativo.");

                }else{
                    System.out.println("No se calcula la suma porque el segundo número es negativo.");

                }

            }

        }else{
            suma = num1 + num2;
            System.out.println("Numeros introducidos: "+num1+", "+num2);
            System.out.println("La suma de los dos numeros es: "+suma);

        }

    }

}