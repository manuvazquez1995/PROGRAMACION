package Mascotas;
import java.io.IOException;

public class Principal implements iTeclado{

    public static void main(String[] args)  throws IOException {

        Inventario inventario = new Inventario();


            inventario.menuOp();
            int op = Integer.parseInt(bf.readLine());  // En estos casos se implementa la interfaz iTeclado.

            while(op!=0){
                switch (op){
                    case 1 -> {
                        // Mostramos una lista simple de animales.
                        inventario.mostrarListaSimple();
                        inventario.menuOp();
                        op = Integer.parseInt(bf.readLine());
                    }
                    case 2 -> {
                        // Mostramos los datos de un animal concreto (buscamos por nombre).
                        inventario.mostrarAnimal();
                        inventario.menuOp();
                        op = Integer.parseInt(bf.readLine());
                    }
                    case 3 -> {
                        // Mostramos una lista completa de animales.
                        inventario.mostrarListaCompleta();
                        inventario.menuOp();
                        op = Integer.parseInt(bf.readLine());
                    }
                    case 4 -> {
                        // Insertamos animales (no pedimos los datos).
                        inventario.insertarAnimales();
                        inventario.menuOp();
                        op = Integer.parseInt(bf.readLine());
                    }
                    case 5 -> {
                        // Borramos un animal concreto del inventario (buscamos por nombre).
                        inventario.borrarAnimal();
                        inventario.menuOp();
                        op = Integer.parseInt(bf.readLine());
                    }
                    case 6 -> {
                        // Vaciamos el inventario.
                        inventario.vaciarInventario();
                        inventario.menuOp();
                        op = Integer.parseInt(bf.readLine());
                    }
                    default -> {
                        System.err.println("Opción no válida, vuelva a intentarlo.");
                        inventario.menuOp();
                        op = Integer.parseInt(bf.readLine());
                    }
                }
            }
            System.out.println("FIN DEL PROGRAMA, HASTA LUEGO.");
    }


}