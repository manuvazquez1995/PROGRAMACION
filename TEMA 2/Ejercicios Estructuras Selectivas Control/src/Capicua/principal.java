package Capicua;
import metodosReutilizables.*;

import java.io.IOException;

public class principal {

    public static void main(String[] args) throws IOException {

        //Pedimos un número cualquiera y lo guardamos en un String.
        System.out.println("Introduzca un número: ");
        String numero = bufferReader.leerString();

        /*
         TODO: Creamos un array String para guardar en él cada uno
          de los dígitos que tiene el número, para ello se
          emplea el método split.
          Le aplicamos la condición que el separador séa cada carácter
          con las comillas sin espacio.
        */
        String[] numberList = numero.split("");

        //Mostramos el número antes de indicar si es capicúa o no.
        System.err.println("** Número: ");
        for(int i=0; i<numero.length(); i++){
            System.out.print(numberList[i]);

        }

        /*Creamos otro array donde guardamos el número en posición invertida.
        Sería el mismo número pero dado la vuelta con el que luego comprobaremos
        si son iguales invertidos.*/
        String[] numberListInverted = new String[numberList.length];
        int x= numberList.length;
        for(int i=0; i<numberList.length; i++){
            numberListInverted[i]=numberList[x-1];
            x--;
        }

        /*Comparamos cada posición de los 2 arrays. Si alguno de los valores de la misma posición
        no es igual, significa que el número no es capicúa.*/
        boolean esCapi=true;
        for(int i=0; i<numberList.length; i++){
            if(numberList[i]!=numberListInverted[i]){
                esCapi=false;
            }
        }

        if(esCapi){
            System.out.println("Es capicua");

        }else{
            System.out.println("No es capicua");

        }









    } //Fin main.






} //Fin clase.
