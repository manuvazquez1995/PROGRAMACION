package Comprobar_numero_primo;
import lectorDatos.reader;

public class esPrimo {

    public static void main(String[] args) {

        System.out.println("***** ¿ES PRIMO? *****\n" +
                "- Introduce un número: ");
        int num = reader.leerInt();
        reader.nextLine();

        if(!esPrimoBoolFor(num)){
            System.out.println("No es primo");
        }else{
            System.out.println("Es primo");
        }


    }

    //Método que devuelve un boleano indicando si es primo o no.
    public static boolean esPrimoBoolWhile(int num){
        boolean primo = true;
        int n = num - 1; //Le restamos 1 porque así omitimos dividir entre el mismo número.
        while(primo && n>1){ //Ponemos >1 para que omita dividir el número entre 1.
            if(num%n==0){
                primo = false;
            }
            n--;
        }
        return primo;
    }


    //Método que hace lo mismo que lo anterior pero con un bucle for.
    public static boolean esPrimoBoolFor(int num){
        boolean primo = true;
        /*Inicializamos desde 2 para omitir dividir el número entre 1.
        * El bucle acaba asta que primo sea false o que "i" supere la resta de "num" - 1
        * para omitir dividir entre el número introducido*/
        for(int i = 2; primo & i<num-1; i++ ){
            if(num%i==0){
                primo = false;
            }
        }
        return primo;
    }





}
