package CajaFuerte;
import metodosReutilizables.*;
import java.util.Random;

/*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
El programa nos pedirá la combinación para abrirla. Si no acertamos,
se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.*/

//TODO: PENDIENTE POR HACER

public class cajaFuerte {

    public static void main(String[] args) {

        //Creamos una constante con un número random de 4 dígitos (también lo mostramos.).
        int combinacion=generarRandom();
        System.err.println(combinacion);

        //Demás atributos.
        int num;
        boolean ok = false;

        System.out.println("****** CAJA FUERTE ******");

        //Con un bucle for pedimos los números (de 4 dígitos).
        for(int i=1; i<5 | !ok; i++){
            System.out.println("Introduce un número: ");
            num=reader.leerInt();
            reader.nextLine();
            //Con un bucle while comprobamos si el número introducido tiene 4 dígitos.
            while(method.numEnteroDigitos(num)==4){
                System.out.println("El número no es de 4 dígitos. Vuelva a intentarlo: ");
                num=reader.leerInt();
                reader.nextLine();
            }
            //Con un if comprobamos si el número introducido es coincide con la combinación.
            if(num==combinacion){
                ok=true;
                System.out.println("BIEN HECHO, CAJA FUERTE ABIERTA.");
            }else{
                System.out.println("COMBINACIÓN INCORRECTA\n" +
                        "Te quedan "+i+" intentos.");
            }

        } //Fin for.

    } //Fin main.




    // TODO: Método para generar un número random, no hacía falta hacerlo ya que esto aun no lo dimos.
    // TODO: aparte no esta bien aunque funciona.
    public static int generarRandom(){
        int rand = (int)(Math.random()*10000+1); //Creamos el número random.
        if(rand<1000){ //A veces me devuelve un número menor que 1000.
            rand=rand+1000; //Le aumentamos 100 en esos casos.
        }
        return rand; //Devolvemos el número random
    }



} //Fin clase.
