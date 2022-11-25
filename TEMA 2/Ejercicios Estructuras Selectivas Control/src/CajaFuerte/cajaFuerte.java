package CajaFuerte;
import metodosReutilizables.*;

/*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
El programa nos pedirá la combinación para abrirla. Si no acertamos,
se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.*/

public class cajaFuerte {

    public static void main(String[] args) {

        //Creamos una constante con un número random de 4 dígitos (también lo mostramos.).
        final int combinacion=generarRandom();
        System.err.println(combinacion);

        //Demás atributos.
        int num;
        int intentos = 4;
        boolean ok = false;

        System.out.println("****** CAJA FUERTE ******");

        //Con un bucle for pedimos los números (de 4 dígitos).
        for(int i=1; intentos>0 & !ok; i++){
            System.out.println("Introduce un número (quedan "+intentos+" intentos): ");
            num=reader.leerInt();
            reader.nextLine();
            //Con un bucle while comprobamos si el número introducido tiene 4 dígitos.
            while(method.numEnteroDigitos(num)!=4){ //Método que comprueba si num tiene 4 dígitos.
                intentos--;
                System.out.println("El número no es de 4 dígitos. Vuelva a intentarlo: ");
                System.out.println("Quedan "+intentos+" intentos");
                num=reader.leerInt();
                reader.nextLine();
            }
            /* Con un if comprobamos si el número introducido es coincide con la combinación,
            usando el método sonIntsIguales que comprueba si son iguales.
            Este método está explicado en metodosReutilizables y se pasa un array como parámetro. */
            int[] comprobar = new int[2];       //Declaramos un nuevo array con 2 posiciones.
            comprobar[0]=num;                   //Guardamos el número introducido por teclado en la posición 0.
            comprobar[1]=combinacion;           //Guardamos la combinación en la posición 1.
            if(method.sonIntsIguales(comprobar)){ //Comprobamos en el if llamando al método pasándole el array anterior.
                ok=true;                          //Y si son iguales cambia ok a verdadero y para el programa.
                System.out.println("BIEN HECHO, CAJA FUERTE ABIERTA.");
            }else{                               //Si no resta un intento y muestra un error. El programa sigue.
                intentos--;
                System.out.println("COMBINACIÓN INCORRECTA\n" +
                        "Te quedan "+intentos+" intentos.");
            }

        } //Fin for.
        reader.close();
    } //Fin main.


    //Método para generar un número random, no hacía falta hacerlo ya que esto aun no lo dimos.
    public static int generarRandom(){
        int rand = (int)(Math.random()*10000+1); //Creamos el número random.
        if(rand<1000){                           //A veces me devuelve un número menor que 1000.
            rand=rand+1000;                      //Le aumentamos 100 en esos casos.
        }
        return rand;                             //Devolvemos el número random
    }


} //Fin clase.
