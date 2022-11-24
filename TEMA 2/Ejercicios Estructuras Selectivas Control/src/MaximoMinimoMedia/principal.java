package MaximoMinimoMedia;
import metodosReutilizables.*;

/*Realiza un programa que calcule el máximo, el mínimo y la media de una serie
de números enteros positivos introducidos por teclado.
El programa terminará cuando el usuario introduzca un número primo.
Este último número no se tendrá en cuenta en los cálculos.
El programa debe indicar también cuántos números ha introducido
el usuario (sin contar el primo que sirve para salir) y la suma acumulada de los mismos.*/

public class principal {

    public static void main(String[] args) {

        /*Variable boleana que le indica al for que se ha introducido un número primo
        y que debe parar*/
        boolean intrPrimo=false;

        int contador=0;
        int numMax=0;
        int numMin=0;
        int sumaNum=0;
        int media=0;

        //Pedimos los números positivos hasta que introduzcamos un número primo (con bucle for).
        for(int i=1; !intrPrimo; i++){
            System.out.println("Introduce un número: ");
            int num=reader.leerInt();
            reader.nextLine();
            //Comprobamos que se introduce un número positivo.
            while(num<0){
                System.err.println("No se admiten números negativos.");
                System.out.println("Vuelva a intentarlo: ");
                num=reader.leerInt();
                reader.nextLine();
            }
            //Comprobamos si el número es primo. Si lo es cambia intrPrimo a falso y para el for.
            if(method.esPrimo(num)){
                intrPrimo=true;
            }else{ //Si no es primo continúa con los cálculos.
                //Aumenta el contador para calcular la media.
                contador++;
                //Para obtener el máximo.
                if(num>numMax){
                    numMax=num;
                }
                //Añadimo siempre el primer número que entra en la primera vuelta del for.
                if(i==1){
                    numMin=num;
                }else{ //Si no comprueba que sea menor que este por cada vuelta que dea.
                    if(num<numMin){numMin=num;}
                }
                //Calculamos la media.
                sumaNum=sumaNum+num;
                media=sumaNum/contador;

            }

        }//Fin for.


        System.out.println("********** RESULTADOS **********\n" +
                "- Nº introducidos: "+contador+"\n" +
                "- Nº máximo: "+numMax+"\n" +
                "- Nº mínimo: "+numMin+"\n" +
                "- Suma total: "+sumaNum+"\n" +
                "- Media: "+media);


    }//Fin main.

}//Fin clase.
