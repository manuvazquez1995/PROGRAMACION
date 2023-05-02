package Ejer_4;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) throws IOException {

        // Ruta del fichero.
        String rutaFichero = "F:\\PROGRAMACION\\TEMA 5\\Ficheros\\src\\Ejer_4\\datos.dat";

        ArrayList<Vehiculo> v = new ArrayList<>();
        v.add(new Vehiculo("0000AAA","BMW",5,"Series 1"));
        v.add(new Vehiculo("1111BBB","Audi",5,"A1"));
        v.add(new Vehiculo("2222CCC","Renault",6,"Renault 5"));

        // Guardamos los datos en un archivo, para mantenerlos aunque se cierre la aplicación con un método.
        Methods.guardarVehiculos(v, rutaFichero);


        // Mostramos los datos guardados en el archivo, con el siguiente método.
        Methods.leerVehiculos(rutaFichero);


        System.out.println("******************************************************");
        // Probamos metiendo otro vehículo sin array para ver si sobrescribe los datos del archivo.
        Vehiculo ve = new Vehiculo("3333MMM","Peugeot",9,"3008");
        Methods.guardarVehiculos(ve, rutaFichero);
        Methods.leerVehiculos(rutaFichero);

        //TODO: al final debe aparecer 4 vehículos, no se sobrescriben. Pero en cada ejecución se duplican los contenidos.


    }



}