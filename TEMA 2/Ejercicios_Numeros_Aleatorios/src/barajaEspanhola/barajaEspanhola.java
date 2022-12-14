package barajaEspanhola;

public class barajaEspanhola {

    // Lo mismo ejercicio de la baraja francesa, pero con la española.

    public static void main(String[] args){

        // Generamos el número de carta y el número del palo.
        int genCarta = (int) (Math.random()*12)+1;
        int genPalo = (int) (Math.random()*4)+1;

        // En estas variables guardamos tanto el palo como la carta, ambos convertidos en String.
        String carta = "";
        String palo = "";

        /* En este Switch convertimos el número de carta en un String, sin embargo,
           en caso de que sea 1, 11, 12, 13 sustituye el valor con una letra correspondiente.
           Guarda el valor en otra variable de tipo String. */
        switch (genCarta){
            case 1  -> carta = "As";
            case 10 -> carta = "Sota";
            case 11 -> carta = "Caballo";
            case 12 -> carta = "Rey";
            default -> carta = String.valueOf(genCarta);
        }

        // Asigna el palo según el número aleatorio correspondiente.
        // Guarda el valor en una variable tipo String.
        switch (genPalo){
            case 1 -> palo = "de Oros";
            case 2 -> palo = " de Bastos";
            case 3 -> palo = "de Copas";
            case 4 -> palo = "de Espadas";
        }

        // Mostramos la carta.
        System.out.println("**** CARTA GENERADA ****\n" + carta + " " + palo);

    }

}
