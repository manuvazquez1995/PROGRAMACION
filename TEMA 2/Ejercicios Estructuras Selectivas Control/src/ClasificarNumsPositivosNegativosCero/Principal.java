package ClasificarNumsPositivosNegativosCero;
import lectorDatos.reader;

/*Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir).
El programa debe informar de cuantos números introducidos son mayores que 0,
menores que 0 e iguales a 0.*/
public class Principal {

    public static void main(String[] args) {

        int nNumeros;
        int numero;
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;

        System.out.println("**** Introduce un número de números ****");
        nNumeros = reader.leerInt();
        reader.nextLine();
        while (nNumeros<0){
            System.out.println("La cantidad de número a introducir no puede ser negativo: ");
            nNumeros = reader.leerInt();
            reader.nextLine();
        }

        /*Pedimos los números según la cantidad anteriormente introducida
        y contamos los positivos, negativos, y ceros.*/
        for(int i=1; i<nNumeros+1; i++){
            System.out.println("Introduce el Nº"+i);
            numero = reader.leerInt();
            reader.nextLine();
            if(numero<0){
                negativos++;
            } else if (numero>0) {
                positivos++;
            }else{
                ceros++;
            }
        }

        //Mostramos los resultados.
        System.out.println("********** RESULTADOS **********\n" +
                "- POSITIVOS: "+positivos+"\n" +
                "- NEGATIVOS: "+negativos+"\n" +
                "- CEROS: "+ceros);

    reader.close();
    }


}
