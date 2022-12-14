package BarajaFrancesa;

public class barajaFrancesa {
    /* Realiza un programa que muestre al azar el nombre de una carta de
       la baraja francesa. Esta baraja está dividida en cuatro palos: picas,
       corazones, diamantes y tréboles. Cada palo está formado por 13 cartas,
       de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7,
       8, 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en
       una cadena de caracteres podemos usar String.valueOf(n). */

    public static void main(String[] args){

        // Generamos el número de carta y el número del palo.
        int genCarta = (int) (Math.random()*13)+1;
        int genPalo = (int) (Math.random()*4)+1;

        // En estas variables guardamos tanto el palo como la carta, ambos convertidos en String.
        String carta = "";
        String palo = "";

        /* En este Switch convertimos el número de carta en un String, sin embargo,
           en caso de que sea 1, 11, 12, 13 sustituye el valor con una letra correspondiente. */
        // Guarda el valor en otra variable de tipo String.
        switch (genCarta){
            case 1  -> carta = "A";
            case 11 -> carta = "J";
            case 12 -> carta = "Q";
            case 13 -> carta = "K";
            default -> carta = String.valueOf(genCarta);
        }

        // Asigna el palo según el número aleatorio correspondiente.
        // Guarda el valor en una variable tipo String.
        switch (genPalo){
            case 1 -> palo = "de Picas";
            case 2 -> palo = " de Corazones";
            case 3 -> palo = "de Tréboles";
            case 4 -> palo = "de Diamantes";
        }

        // Mostramos la carta.
        System.out.println("**** CARTA GENERADA ****\n" + carta + " " + palo);

    }

}
