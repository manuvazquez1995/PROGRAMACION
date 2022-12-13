package NumAleatoriosGen;

public class numAleatoriosGen_1_10 {
    /* Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
       separados por espacios. */

    public static void main(String[] args){
        //Creamos un array para guardar los números aleatorios.
        int[] numerosRandom = new int[20];

        //Utilizamos un bucle for para generar cada número aleatorio asta 20.
        for(int i=0; i<20; i++){
            numerosRandom[i] = (int) (Math.random()*11);
        }

        //Utilizamos otro bucle for para mostrar los números por pantalla.
        for(int i=0; i<20; i++){
            System.out.print(numerosRandom[i]+"  ");
        }

    }

}
