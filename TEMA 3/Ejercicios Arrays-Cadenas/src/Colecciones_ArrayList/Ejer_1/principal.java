package Colecciones_ArrayList.Ejer_1;
import java.io.IOException;
import java.util.ArrayList;
import metodosReutilizables.*;

import static Arrays_Objetos.Ejer_Obj_4.metodos.menu;

class principal {

    /*
    Realizar un programa que cree una colección dinámica de tipo ArrayList, de objetos de la clase Producto y realice los métodos:

        1_Añadir objetos a la colección usando un bucle adecuado.
        2_Listar los productos almacenados.
        3_Sumar filas (Media de cada precio producto en las tres ciudades).
        4_Clasificar por productos/ordenación: ascendente / descendente
        5_Buscar un producto(dicotómica).
        6_Salir.
     */
    public static void main(String[] args) throws IOException {

        // Declaramos el array_list.
        ArrayList<producto> productos = new ArrayList<>();

        // Menú principal.
        methods.menu();
        int op = bufferReader.leerInt();

        while(op!=6){
            switch (op){
                case 1 -> {
                    // TODO: hace falta retocar.
                    methods.crearProducto(productos);
                    methods.menu();
                    op = bufferReader.leerInt();
                }
                case 2 -> {
                    methods.mostrarProductos(productos);
                    methods.menu();
                    op = bufferReader.leerInt();
                }
                case 3 -> {
                    methods.calcMediaProd(productos);
                    methods.menu();
                    op = bufferReader.leerInt();
                }
                case 4 -> {
                    //TODO: el método de ordenación es provisional (burbuja), se va a implementar otro tipo de implementación.
                    methods.mostrarListaOrdenadaNombre(productos);
                    methods.menu();
                    op = bufferReader.leerInt();
                }
                case 5 -> {
                    methods.buscador(productos);
                    methods.menu();
                    op = bufferReader.leerInt();
                }
                default -> {
                    System.err.println("Opción no válida, introduzca una correcta.");
                    methods.menu();
                    op = bufferReader.leerInt();
                }
            }
        }


    }


}