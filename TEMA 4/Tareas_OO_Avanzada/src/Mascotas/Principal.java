package Mascotas;
//import metodosReutilizables.bufferReader;
import java.io.IOException;

public class Principal implements iTeclado{

    public static void main(String[] args)  throws IOException {

        Inventario inventario = new Inventario();


            inventario.menuOp();
            int op = Integer.parseInt(bf.readLine());  // En estos casos se implementa la interfaz iTeclado.

            while(op!=0){
                switch (op){
                    case 1 -> {
                        // TODO: FUNCIONA
                        inventario.mostrarListaSimple();
                        inventario.menuOp();
                        op = Integer.parseInt(bf.readLine());
                    }
                    case 2 -> {}
                    case 3 -> {
                        // TODO: FUNCIONA
                        inventario.mostrarListaCompleta();
                        inventario.menuOp();
                        op = Integer.parseInt(bf.readLine());
                    }
                    case 4 -> {
                        // TODO: FUNCIONA
                        inventario.insertarAnimales();
                        inventario.menuOp();
                        op = Integer.parseInt(bf.readLine());
                    }
                    case 5 -> {
                        // TODO: QUEDA POR COMPLETAR.
                        inventario.borrarAnimal();
                        inventario.menuOp();
                        op = Integer.parseInt(bf.readLine());
                    }
                    case 6 -> {
                        // TODO: FUNCIONA
                        inventario.vaciarInventario();
                        inventario.menuOp();
                        op = Integer.parseInt(bf.readLine());
                    }
                    default -> {
                        // TODO: FUNCIONA
                        System.err.println("Opción no válida, vuelva a intentarlo.");
                        inventario.menuOp();
                        op = Integer.parseInt(bf.readLine());
                    }
                }
            }
            System.out.println("FIN DEL PROGRAMA, HASTA LUEGO.");


    }



}