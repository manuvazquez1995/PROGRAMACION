package Ejer_4;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        // Ruta del fichero.
        String rutaFichero = "F:\\PROGRAMACION\\TEMA 5\\Ficheros\\src\\Ejer_4\\datos.dat";

        ArrayList<Vehiculo> v = new ArrayList<>();
        v.add(new Vehiculo("0000AAA","BMW",5,"Series 1"));
        v.add(new Vehiculo("1111BBB","Audi",5,"A1"));
        v.add(new Vehiculo("2222CCC","Renault",6,"Renault 5"));

        // Guardamos los datos en un archivo, para mantenerlos aunque se cierre la aplicación con un método.




    }









}