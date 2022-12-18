package numerosAleatorios;

public class melodia {

    //Método para generar notas aleatorias.
    public static String generarNota(){
        int num = (int) (Math.random()*7)+1;
        String nota = "";
        switch (num){
            case 1 -> nota = "do";
            case 2 -> nota = "re";
            case 3 -> nota = "mi";
            case 4 -> nota = "fa";
            case 5 -> nota = "sol";
            case 6 -> nota = "la";
            case 7 -> nota = "si";
        }
        return nota;
    }

    public static void generarMelodia(){
        int nNotas = (int) (Math.random()*28); //Crea un número de notas totales de la melodía.
        do{                                    //Comprueba que el número de notas generado sea múltiplo de 4.
            nNotas = (int) (Math.random()*28);
        }while(nNotas%4!=0 | nNotas==0);

        int nCompases = nNotas / 4;  //Genera el número de compases.

        String nPrimera = generarNota(); //Guardamos la primera notas que también será la última.
        for(int i=1; i<=nCompases; i++){
            if(i==1){       //Asignamos la primera nota del primer compás.
                System.out.print(" "+nPrimera+" "+generarNota()+" "+generarNota()+" "+generarNota()+" |");
            }
            //Para los compases que están en el medio.
            System.out.print(" "+generarNota()+" "+generarNota()+" "+generarNota()+" "+generarNota()+" |");
            //Para el último compás, añade la nota que guardamos previamente (la primera) en la última posición junto a la doble barra.
            if(i==nCompases) {
                System.out.print(" "+generarNota()+" "+generarNota()+" "+generarNota()+" "+nPrimera+" ||");
            }
        }

    }

}