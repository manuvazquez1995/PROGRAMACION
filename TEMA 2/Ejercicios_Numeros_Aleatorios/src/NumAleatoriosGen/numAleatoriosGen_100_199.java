package NumAleatoriosGen;

public class numAleatoriosGen_100_199 {

    public static void main(String[] args){
        /* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
           separados por espacios. Muestra también el máximo, el mínimo y la media
           de esos números. */
        int[] numerosRandom = new int[50];
        int maximo = 0;
        int minimo = 0;
        int suma = 0;
        int media = 0;

        //For que genera los 20 números aleatorios con una fórmula.
        for(int i=0; i<50; i++){
            numerosRandom[i]= (int) (Math.random()*(199-100)+100); //También podría ser: Math.random()*100+100
        }

        //For que muestra los números aleatorios.
        for(int i=0; i<50; i++){
            System.out.print(numerosRandom[i]+"  ");
        }

        for(int i=0; i<50; i++){
            // Asignamos el máximo y el mínimo (solo en la primera vuelta del for.)
            if(i==0){
                maximo = numerosRandom[i];
                minimo = numerosRandom[i];
            }

            // Suma de todos los números.
            suma = suma + numerosRandom[i];
            // Para saber cuál es el mínimo.
            if(numerosRandom[i]<minimo){
                minimo = numerosRandom[i];
            }
            // Para saber cuál es el máximo.
            if(numerosRandom[i]>maximo){
                maximo = numerosRandom[i];
            }
            // Para saber la media.
            media = suma / 50;
        }

        //Mostramos la suma, máximo, mínimo, media.
        System.out.println();
        System.out.println("- SUMA: "+suma);
        System.out.println("- MÁXIMO: "+maximo);
        System.out.println("- MÍNIMO: "+minimo);
        System.out.println("- MEDIA: "+media);


    }


}
