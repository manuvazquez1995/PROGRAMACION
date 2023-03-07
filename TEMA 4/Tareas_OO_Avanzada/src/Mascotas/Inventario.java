package Mascotas;
import metodosReutilizables.bufferReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;


public class Inventario {


    // ArrayList para guardar una lista de mascotas.
    private static final ArrayList<Mascota> inventario = new ArrayList<>();


    // Método que muestra las opciones del menú.
    public void menuOp(){
        System.out.println("""
                ************* MENÚ *************
                (1) Mostrar la lista de animales (solo tipo y nombre).
                (2) Mostrar todos los datos de un animal concreto.
                (3) Mostrar todos los datos de todos los animales.
                (4) Insertar animales en el inventario.
                (5) Eliminar animales del inventario.
                (6) Vaciar el inventario.
                (0) Salir
                
                - Escoja una opción:
                """);
    }


    // Método que muestra una lista simple (solo tipo y nombre) de cada animal CON ITERADOR.
    public void mostrarListaSimple(){
        if(inventario.isEmpty()){
            System.err.println("* No hay animales en la lista, insértelos por favor.");
        }else {
            System.out.println("****** LISTA SIMPLE DE ANIMALES ******");
            for (Mascota i : inventario) {
                if (i instanceof Perro) {
                    System.out.println("* PERRO: " + i.getNombre());
                } else if (i instanceof Gato) {
                    System.out.println("* GATO: " + i.getNombre());
                } else if (i instanceof Loro) {
                    System.out.println("* LORO: " + i.getNombre());
                } else if (i instanceof Canario) {
                    System.out.println("* CANARIO: " + i.getNombre());
                }
            }
        }
        System.out.println();
    }


    // Método que muestra todos los datos de todos los animales con los métodos "mostrar" que hay en cada clase.
    public void mostrarListaCompleta(){
        if(inventario.isEmpty()){
            System.err.println("* No hay animales en la lista, insértelos por favor.");
        }else {
            System.out.println("****** LISTA COMPLETA DE LOS ANIMALES ******");
            for (Mascota i : inventario) {
                i.mostrar();   // Mostramos los datos de cada uno de los animales, usando un método que está en sus respetivas clases.
                System.out.println();
            }
            System.out.println();
        }
    }


    // Método que inserta animales en la lista.
    public void insertarAnimales(){
        inventario.add(new Perro("Toby", 5, "Vivo", "21/11/2018", "Pastor alemán", false));
        inventario.add(new Gato("Onix", 2, "Enfermo", "25/06/2021", "Marrón", false));
        inventario.add(new Gato("Pepe", 2, "Enfermo", "25/06/2021", "Marrón", false));
        inventario.add(new Loro("Paco", 1, "Muerto", "02/02/2022", "Corto", false, "México", false));
        inventario.add(new Canario("Chacho", 1, "Vivo", "01/01/2022", "Largo", true, "Amarillo", true));
        System.out.println("* Animales añadidos *");
        System.out.println();
    }


    // Método que borra animales del inventario.
    public void borrarAnimal() throws IOException {
        if(inventario.isEmpty()){
            System.err.println("* No hay animales en la lista, insértelos por favor.");
        }else{
            System.out.println("****** BORRAR ANIMAL ******");
            System.out.println("Introduce nombre: ");
            String n = bufferReader.leerString();
            ordenarAnimales(); //Antes de hacer la búsqueda, ordena la lista por orden alfabético.
            if(!buscarAnimal(n)){
                System.out.println("NO EXISTE EL ANIMAL");
            }else{
                System.out.println("EXISTE");
            }
        }
    }


    // Este método que sirve para vaciar completamente la lista de animales.
    public void vaciarInventario(){
        if(inventario.isEmpty()){
            System.err.println("* No hay animales en la lista, insértelos por favor.");
        }else{
            inventario.clear();   // Para vaciar el inventario.
            System.out.println("** El inventario se ha vaciado correctamente. **");
            System.out.println();
        }
    }



    // Método que ordena por orden alfabético los animales (por nombre).
    public void ordenarAnimales(){
            inventario.sort(Comparator.comparing(Mascota::getNombre)); // Una forma de ordenar un arrayList.
    }


    // Método que busca devuelve true si existe un determinado animal en la lista, false si no.
    public boolean buscarAnimal(String key){
        boolean ok = false;
        int index = Integer.MAX_VALUE;
        int low = 0;
        int high = inventario.size()-1;
        while (low<=high){
            int mid = (low + high) / 2;
            if(inventario.get(mid).getNombre().compareTo(key)<0) {
                low = mid + 1;
            } else if (inventario.get(mid).getNombre().compareTo(key)>0) {
                low = mid - 1;
            } else if (inventario.get(mid).getNombre().compareTo(key)==0) {
                index = mid;
                break;
            }
        }
        if(index!=Integer.MAX_VALUE) ok = true;
        return ok;
    }
    // Método que busca devuelve pos si existe un determinado animal en la lista.
    /*public int buscarAnimal(String key){
        // boolean ok = false;
        int pos = 0;
        //ordenaciónArrayList();
        int index = Integer.MAX_VALUE;
        int low = 0;
        int high = inventario.size()-1;
        while (low<=high){
            int mid = (low + high) / 2;
            if(inventario.get(mid).getNombre().compareTo(key)<0){
                low = mid + 1;
            } else if (inventario.get(mid).getNombre().compareTo(key)>0) {
                low = mid - 1;
            } else if (inventario.get(mid).getNombre().compareTo(key)==0) {
                index = mid;
                break;
            }
        }
        if(index!=Integer.MAX_VALUE)  pos = index;
        return pos;
    }*/




}