public class Carta {

    palos palo;
    int numero;


    // Constructor que al llamarlo crea una carta aleatoria.
    public Carta(){
        generarPalo();
        generarNumero();
    }


    // Método que genera el palo de la carta.
    public void generarPalo(){
        // Generamos el número aleatorio del 1 al 4 para asignar el palo de la carta.
        int numPalo = (int)Math.floor(Math.random()*4+1);

        // Con el número anterior asignamos el palo de la carta.
        /*
           1 -> copas; 2 -> bastos; 3 -> oros; 4 -> espadas
         */
        switch (numPalo){
            case 1 -> palo = palos.COPAS;
            case 2 -> palo = palos.BASTOS;
            case 3 -> palo = palos.OROS;
            case 4 -> palo = palos.ESPADAS;
        }
    }


    // Método que genera el número de la carta entre 1 y 12.
    public void generarNumero(){
        numero = (int)Math.floor(Math.random()*12+1);
    }

    public palos getPalo() {
        return palo;
    }

    public void setPalo(palos palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}