package ClasificarNumsPositivosNegativosCero;
import lectorDatos.reader;

//Bucle do-while que termina cuando se introduce por teclado un número impar.
public class HacerMientrasImpar {

    public static void main(String[] args) {

        int numero;

        System.out.println("Introduce un número: ");
        numero=reader.leerInt();
        reader.nextLine();
        //Bucle do-while para comprobar.
        do{
            System.out.println("El número "+numero+" NO ES IMPAR.\n" +
                    "Introduce otro número.");
            numero=reader.leerInt();
            reader.nextLine();
        }while(!comprobarImpar(numero));

        System.out.println("ES IMPAR");

    }

    //Método para comprobar si es impar.
    public static boolean comprobarImpar(int numero){
        boolean esImpar=false;
        if(numero/2!=0){
            esImpar=true;
        }
        return esImpar;
    }



}
