package Colecciones_ArrayList.Ejer_1;
import metodosReutilizables.*;
import java.io.IOException;
import java.util.ArrayList;

class methods {

    // Método para imprimir las opciones del menú.
    public static void menu(){
        System.out.println("""
                ******************** MENÚ ********************
                (1) Añadir objetos a la colección usando un bucle adecuado.
                (2) Listar los productos almacenados.
                (3) Sumar filas (Media de cada precio producto en las tres ciudades).
                (4) Clasificar por productos/ordenación. ascendente/descendente.
                (5) Buscar un producto(dicotómica).
                (6) Salir.
                - Escoja una opción:
                """);
    }


    // Método para crear un producto y guardarlo en un arrayList.
    public static void crearProducto(ArrayList<producto> productos) throws IOException {
        System.out.println("***** NUEVO PRODUCTO *****");
        System.out.println("- Introduzca el nombre del producto: ");
        String nombre = bufferReader.leerString();
        System.out.println("- Introduce su precio en Vigo: ");
        float precioVigo = bufferReader.leerFloat();
        while (esNeg(precioVigo)) {
            System.err.println("El precio no puede ser negativo.");
            System.out.println("Introduzca un precio válido.");
            precioVigo = bufferReader.leerFloat();
        }
        System.out.println("- Introduce su precio en Santiago: ");
        float precioSantiago = bufferReader.leerFloat();
        while (esNeg(precioSantiago)) {
            System.err.println("El precio no puede ser negativo.");
            System.out.println("Introduzca un precio válido.");
            precioSantiago = bufferReader.leerFloat();
        }
        System.out.println("- Introduce su precio en Madrid: ");
        float precioMadrid = bufferReader.leerFloat();
        while (esNeg(precioMadrid)) {
            System.err.println("El precio no puede ser negativo.");
            System.out.println("Introduzca un precio válido.");
            precioMadrid = bufferReader.leerFloat();
        }

        productos.add(new producto(nombre, precioVigo, precioSantiago, precioMadrid));

        System.out.println();
    }


    // Método que muestra los productos almacenados.
    public static void mostrarProductos(ArrayList<producto> productos){
        if(productos.isEmpty()){
            System.err.println("No hay productos en la lista.");
        }else {
            System.out.println("***** LISTA DE PRODUCTOS *****");
            for (producto p : productos) {
                System.out.println("- Producto: " + p.getNombre());
                System.out.println("- Precio Vigo: " + p.getPrecioVigo());
                System.out.println("- Precio Santiago: " + p.getPrecioSantiago());
                System.out.println("- Precio Madrid: " + p.getPrecioMadrid());
                System.out.println();
            }
        }
    }


    // Para calcular la media de cada producto en las tres ciudades y mostrarlo por pantalla.
    public static void calcMediaProd(ArrayList<producto> productos){
        System.out.println("***** MEDIA PRECIO DE CADA PRODUCTOS *****");
        for(producto p : productos){
            float suma = 0;
            float media = 0;
            suma = p.getPrecioMadrid()+p.getPrecioVigo()+p.getPrecioSantiago();
            media = suma / 3;
            System.out.println("- "+p.getNombre()+": "+media);
        }
        System.out.println();
    }


    // TODO: ESTO ES PROVISIONAL.
    // Para ordenar por nombre del producto, orden alfabético (método burbuja).
    public static void ordenarPorNombreProducto (ArrayList<producto> productos){
        boolean ordenado=false;
        int cuentaIntercambios=0;
        //Usamos un bucle anidado, saldra cuando esté ordenado el array
        while(!ordenado){
            for(int i=0;i<productos.size()-1;i++){
                // TODO: en este caso, compareToIgnoreCase sirve para comparar si dos palabras son iguales.
                if (productos.get(i).getNombre().compareToIgnoreCase(productos.get(i+1).getNombre())>0){
                    //Intercambiamos valores
                    producto aux = productos.get(i);
                    productos.set(i, productos.get(i+1));
                    productos.set(i+1, aux);
                    //indicamos que hay un cambio
                    cuentaIntercambios++;
                }
            }
            //Si no hay intercambios, es que está ordenado.
            if (cuentaIntercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaIntercambios=0;
        }
    }


    // Mostrar los productos ordenados por nombre.
    public static void mostrarListaOrdenadaNombre(ArrayList<producto> productos){
        ordenarPorNombreProducto(productos);
        if(productos.isEmpty()){
            System.err.println("No hay productos en la lista.");
        }else {
            System.out.println("***** LISTA DE PRODUCTOS *****");
            for (producto p : productos) {
                System.out.println("- Producto: " + p.getNombre());
                System.out.println("- Precio Vigo: " + p.getPrecioVigo());
                System.out.println("- Precio Santiago: " + p.getPrecioSantiago());
                System.out.println("- Precio Madrid: " + p.getPrecioMadrid());
                System.out.println();
            }
        }
    }


    // Método que busca un producto por nombre.
    public static void buscador(ArrayList<producto> productos) throws IOException {
        System.out.println("***** BUSCADOR PRODUCTOS *****");
        System.out.println("- Introduce el nombre del producto a buscar: ");
        String nombreProd = bufferReader.leerString();
        methods.busquedaBinNombre(productos, nombreProd, 0, productos.size()-1);
    }


    // Método que busca un producto en un ArrayList por nombre (Busqueda Dicotómica para el método buscador).
    public static void busquedaBinNombre(ArrayList<producto> productos, String  key, int low, int high) {

        int index = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (productos.get(mid).getNombre().compareToIgnoreCase(key) < 0) {
                low = mid + 1;
            } else if (productos.get(mid).getNombre().compareToIgnoreCase(key) > 0) {
                high = mid - 1;
            } else if (productos.get(mid).getNombre().compareToIgnoreCase(key) == 0) {
                index = mid;
                break;
            }
        }

        if(index!=Integer.MAX_VALUE){
            System.out.println("¡¡ El producto está en la lista !!");
            System.out.println();
        }else{
            System.err.println("¡¡ El producto NO está en la lista !!");
            System.out.println();
        }
    }


    //Método que comprueba si un número es negativo (para floats).
    public static boolean esNeg(float num){
        boolean esNeg = false;
        if(num<0){
            esNeg = true;
        }
        return esNeg;
    }



}