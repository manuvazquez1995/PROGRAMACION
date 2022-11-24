package NumParesEntreDosNums;
import lectorDatos.reader;

//Muestra todos los números pares que hay entre 2 números introducidos por teclado.
public class Principal {

    public static void main(String[] args) {

        System.out.println("***** Mostrar los números pares comprendidos entre 2 números *****\n" +
                "- Introduce el 1º número: ");
        int num1 = reader.leerInt();
        reader.nextLine();
        System.out.println("- Introduce el 2º número: ");
        int num2 = reader.leerInt();
        reader.nextLine();

        //En el siguiente bucle comprueba se hay pares entre los 2 numeros introducidos.
        for(int i=num1;i<=num2;i++){
            if(comprobarPar(i)){System.out.println(i);}
        }

    reader.close();
    }

    //Método que comprueba si un número pasado por teclado es par.
    public static boolean comprobarPar(int i){
        boolean esPar = false;
        if(i%2==0){
            esPar = true;
        }
        return esPar;
    }



}
