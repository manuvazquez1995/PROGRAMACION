package Mascotas;
import metodosReutilizables.bufferReader;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {

        Inventario inventario = new Inventario();


            inventario.menuOp();
            int op = bufferReader.leerInt();

            while(op!=0){
                switch (op){
                    case 1 -> {
                        // TODO: FUNCIONA
                        inventario.mostrarListaSimple();
                        inventario.menuOp();
                        op = bufferReader.leerInt();
                    }
                    case 2 -> {}
                    case 3 -> {
                        // TODO: FUNCIONA
                        inventario.mostrarListaCompleta();
                        inventario.menuOp();
                        op = bufferReader.leerInt();
                    }
                    case 4 -> {
                        // TODO: FUNCIONA
                        inventario.insertarAnimales();
                        inventario.menuOp();
                        op = bufferReader.leerInt();
                    }
                    case 5 -> {

                        inventario.borrarAnimal();
                        inventario.menuOp();
                        op = bufferReader.leerInt();
                    }
                    case 6 -> {
                        // TODO: FUNCIONA
                        inventario.vaciarInventario();
                        inventario.menuOp();
                        op = bufferReader.leerInt();
                    }
                    default -> {
                        // TODO: FUNCIONA
                        System.err.println("Opción no válida, vuelva a intentarlo.");
                        inventario.menuOp();
                        op = bufferReader.leerInt();
                    }
                }
            }
            System.out.println("FIN DEL PROGRAMA, HASTA LUEGO.");


    }


}