package CalcetinesNavidad;
import metodosReutilizables.*;
import java.io.IOException;

/* Escribe un programa que pinte por pantalla un par de calcetines,
de los que se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario introduce una altura mayor o igual a 4.
Observa que la talla de los calcetines y la distancia
que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.*/

public class principal {

    public static void main(String[] args) throws IOException{

        //Pedimos la altura de los calcetines.
        System.out.println("Introduzca la altura de los calcetines: ");
        int altura = bufferReader.leerInt();
        //Comprobamos si es negativo.
        while(method.esNegativo(altura)){
            System.out.println("Por favor, introduzca un número positivo: ");
            altura = reader.leerInt();
            reader.nextLine();
        }

        //Creamos un objeto calcetines pasándole la altura.
        calcetines calcet = new calcetines(altura);

        //Imprimimos los calcetines llamando al método que tiene la clase calcetines.
        System.out.println("-------------------------------");
        calcet.dibujarCalcetines();


    } //Fin main.

} //Fin clase.