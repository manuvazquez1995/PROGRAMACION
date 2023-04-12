import java.util.ArrayList;

public class Mazo {

    // ArrayList que contiene las cartas creadas aleatoriamente.
    static ArrayList<Carta> mazo = new ArrayList<>();


    // Con el constructor creamos el mazo y lo rellenamos de cartas con un método.
    public Mazo(){
        rellenarMazo();
    }

    // Rellenamos el arrayList con las cartas (hasta 8).
    public static void rellenarMazo(){
        for(int i = 0; i<8; i++){
            mazo.add(new Carta());
        }
    }


    // Método que calcula los puntos totales según los palos de las cartas (Oros:4, Espadas:3, Copas:2, Bastos:1).
    public static int calcularTotalPuntos(){
        int puntos = 0;
        for(Carta c : mazo){
            switch (c.palo){
                case OROS -> puntos += 4;
                case ESPADAS -> puntos += 3;
                case COPAS -> puntos += 2;
                case BASTOS -> puntos += 1;
            }
        }
        return puntos;
    }

    // Método para mostrar las cartas del mazo y los puntos totales según palo de carta.
     void mostrarMazo(){
        System.out.println("***** MAZO *****");
        System.out.println("================");
        for(Carta c : mazo){
            System.out.println(c.numero+" de "+c.palo);
            System.out.println("================");
        }
        System.out.println("* PUNTOS: "+calcularTotalPuntos());
    }

}