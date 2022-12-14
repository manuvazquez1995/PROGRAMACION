package tresDados;

import java.util.Random;

public class tresDados {
    /* todo: Escribe un programa que muestre la tirada de tres dados. */
    // En este ejercicio

    public static void main (String[] args){

        // 3 variables donde se guardarán el valor de los dados.
        int dado1 = (int) (Math.random()*6)+1;
        int dado2 = (int) (Math.random()*6)+1;
        int dado3 = (int) (Math.random()*6)+1;

        System.out.println("***** RESULTADOS *****\n" +
                "- Dado 1: "+dado1+"\n" +
                "- Dado 2: "+dado2+"\n" +
                "- Dado 3: "+dado3+"\n");

    }

}
