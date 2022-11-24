// Escribir un programa que nos pida por teclado dos números enteros y que
// continuación nos escriba en pantalla la suma de los dos números solamente si
// los dos son positivos. Si no se cumplen que los dos son positivos se visualizará
// un mensaje indicándolo. La salida tiene que tener el formato siguiente:
// Números introducidos: XX, XX
// La suma de los dos números es: XXX
// No se calcula la suma porque algunos de los números o los dos no son positivos.


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
            System.out.println("No se calcula la suma porque algunos de los números o los dos no son positivos.");

        }else{
            suma = num1 + num2;
            System.out.println("Numeros introducidos: "+num1+", "+num2);
            System.out.println("La suma de los dos numeros es: "+suma);

        }

    }

}