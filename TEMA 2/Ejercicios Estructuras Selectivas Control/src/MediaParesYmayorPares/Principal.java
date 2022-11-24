package MediaParesYmayorPares;
import metodosReutilizables.*;

/* Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo
y nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
El número negativo solo se utiliza para indicar el final de la introducción de datos pero no
incluye en el cómputo. */

public class Principal {

    public static void main(String[] args) {

        //Atributos.
        int num;
        int contador=0; //Contador de números introducidos.
        int contadorImp=0; //Contador de impares.
        int sumaMediaImp=0; //Para sumar los impares antes de hacer la media.
        int mediaImp=0; //Para calcular la media de los impares.
        int numParMax=0; //Para guardar el número más alto de los pares introducidos..

        System.out.println("******** CÓMPUTO DE NÚMEROS ********");
        //Si el primer nº es negativo, ya no lo hace, de lo contrario sigue pidiendo nº en el while.
        do{
            /*Pedimos el primer número para el cómputo.*/
            System.out.println("Introduce un número (negativo para salir): ");
            num=reader.leerInt();
            reader.nextLine();
            /* Con este if hacemos las operaciones si el número no es negativo.
            Si lo es no hace nada. Esto es para poder introducir el negativo y
            acabar con el programa. */
            if(num>=0){
                contador++; //Número válido, continúa el bucle aumentando el contador a 1.
                if (method.esPar(num)) {
                    if (num > numParMax) { //Si es mayor que numParMax los sustituye.
                        numParMax = num;
                    }
                } else { //Si es impar, calculamos la media de ellos. Antes aumentamos contadorImp.
                    contadorImp++;
                    sumaMediaImp = sumaMediaImp + num;
                    mediaImp = sumaMediaImp / contadorImp;
                }
            }
        }while(num>=0); //Fin bucle while.

        //Mostramos los resultados.
        System.out.println("************ RESULTADOS ************\n" +
                "- Cantidad nºs introducidos: "+contador+"\n" +
                "- Media impares: "+mediaImp+"\n" +
                "- Par mas alto: "+numParMax);


    } //Fin main.


} //Fin clase.
