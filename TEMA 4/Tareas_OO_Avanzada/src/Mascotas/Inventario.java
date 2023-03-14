package Mascotas;
import metodosReutilizables.bufferReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;


public class Inventario {


    // ArrayList para guardar una lista de mascotas.
    private static final ArrayList<Animal> inventario = new ArrayList<>();


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
            for (Animal i : inventario) {
                if (i instanceof Perro) {
                    System.out.println("* PERRO: " + i.getNombre());
                    if(((Perro) i).getRevisiones().isEmpty()){
                        System.err.println("- Este perro no tiene historial de revisiones.");
                    }else{
                        System.out.println("Repetida\t Fecha\t Vacuna");
                        for(HistorialRevisiones h : ((Perro) i).getRevisiones()){
                            System.out.print(h.isRepetida()+"\t "+h.getFecha()+"\t "+h.isVacuna());
                        }
                    }
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
            for (Animal i : inventario) {
                i.mostrar();   // Mostramos los datos de cada uno de los animales, usando un método que está en sus respetivas clases.
                System.out.println();
                if (i instanceof Perro) {
                    if (((Perro) i).getRevisiones().isEmpty()) {
                        System.out.println("- Este perro no tiene historial de revisiones.");
                        System.out.println();
                    } else {
                        System.out.println("Repetida\t Fecha\t Vacuna");
                        for (HistorialRevisiones h : ((Perro) i).getRevisiones()) {
                            System.out.println(h.isRepetida() + "\t " + h.getFecha() + "\t " + h.isVacuna());
                        }
                        System.out.println();
                    }
                }
            }
            System.out.println();
        }
    }


    // Método que inserta animales en la lista.
    public void insertarAnimales(){

        // Datos de las revisiones del perro.
        Animal a1 = new Perro("Toby", 5, "Vivo", "21/11/2018", "Pastor alemán", false,
                false, " ", false);


        Animal a2 = new Gato("Onix", 2, "Enfermo", "25/06/2021", "Marrón", false);
        Animal a3 =new Gato("Pepe", 2, "Enfermo", "25/06/2021", "Marrón", false);
        Animal a4 = new Loro("Paco", 1, "Muerto", "02/02/2022", "Corto", false, "México", false);
        Animal a5 = new Canario("Chacho", 1, "Vivo", "01/01/2022", "Largo", true, "Amarillo", true);

        inventario.add(a1);
        inventario.add(a2);
        inventario.add(a3);
        inventario.add(a4);
        inventario.add(a5);
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
            if(buscarAnimal(n)==Integer.MAX_VALUE){
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
            inventario.sort(Comparator.comparing(Animal::getNombre)); // Una forma de ordenar un arrayList.
    }


    // Método que busca devuelve true si existe un determinado animal en la lista, false si no.
    public int buscarAnimal(String nombre){
        int index = Integer.MAX_VALUE;
        for(int i = 0;i < inventario.size(); i++){
            if(Objects.equals(inventario.get(i).getNombre(), nombre)){
                index = i;
            }
        }
        return index;
    }



}