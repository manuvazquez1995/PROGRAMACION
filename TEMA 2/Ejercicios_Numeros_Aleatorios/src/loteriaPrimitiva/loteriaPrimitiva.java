package loteriaPrimitiva;

public class loteriaPrimitiva {

    public static void main(String[] args){
    /* TODO: Simular el juego de la lotería primitiva.
    *  6 Números 1-49 (sin repetir)
    *  1 reintegro 0-9
    *  posible repetición de los números (unos de los 6 números puede coincidir con el registro.) */

        //Array para guardar la combinación ganadora generada con aleatorios y otro para el reintegro.
        int[] combGan = new int[6];
        int[] reinGan = new int[2];

        //Generamos los números de la combinación ganadora.
        crearComb(combGan);
        crearRein(reinGan);

        // Mostramos la combinación ganadora.
        for(int i=0; i<combGan.length; i++){
            System.out.print(combGan[i]+" ");
        }

        System.out.println("");

        for(int i=0; i<reinGan.length; i++){
            System.out.print(reinGan[i]+" ");
        }



    }


    // Método para crear el número premiado.
    public static int[] crearComb(int[] combGan){

        //Generamos los números al array que recibe.
        for(int i=0; i< combGan.length; i++){
            // Variable para comprobar que el número generado no es igual a algún número introducido.
            boolean ok = false;
            // Con el siguiente while comprobamos y creamos que el número no se repite con los anteriores.
            while(!ok){
                int nAleatorio = (int) (Math.random()*49)+1;
                for(int x=0; x < combGan.length; x++){
                    if(combGan[i]!=nAleatorio){   // TODO: esta condición está mal, no comprueba repetidos.
                        combGan[i] = nAleatorio;
                        ok = true;
                    }
                }
            }
        }
        return combGan;
    }

    // Método para crear el reintegro.
    public static int[] crearRein(int[] reinGan){
        for(int i=0; i<reinGan.length; i++){
            reinGan[i] = (int) (Math.random()*9)+1;
        }
        return reinGan;
    }







}
