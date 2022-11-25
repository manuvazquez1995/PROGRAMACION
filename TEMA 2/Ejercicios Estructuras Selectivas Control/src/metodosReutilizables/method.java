package metodosReutilizables;

//TODO: aquí se guarda métodos reutilizables para cualquier proyecto.
public class method {

    //Método que comprueba si un número es primo.
    public static boolean esPrimo(int num){
        boolean primo = true;
        for(int i = 2; primo & i<num-1; i++ ){
            if(num%i==0){
                primo = false;
            }
        }
        return primo;
    }


    //Método para comprobar si un número es par.
    public static boolean esPar(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }


    //Método que cuenta el número de dígitos que tiene un número entero.
    public static int numEnteroDigitos(int num){
        String x = Integer.toString(num);       //Convierte el número en un string.
        return x.length();                      //Devuelve el número de caracteres del string, que será el número de dígitos.
    }


    /*Método que comprueba si 2 enteros son iguales.
    Pasando un array como parámetros.*/
    public static boolean sonIntsIguales(int[] nums){
        boolean sonIguales = false;
        if(nums[0]==nums[1]){
            sonIguales = true;
        }
        return sonIguales;
    }




} //Fin clase
