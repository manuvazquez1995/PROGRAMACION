package Mascotas;
import java.io.IOException;
import java.util.ArrayList;
import metodosReutilizables.bufferReader;

public class Inventario {

    private static final ArrayList<Mascota> inventario = new ArrayList<>();

    public void menu() throws IOException {

        methods.menuOp();
        int op = bufferReader.leerInt();

        while(op!=0){
            switch (op){
                case 1 -> {}
                case 2 -> {}
                case 3 -> {}
                case 4 -> {}
                case 5 -> {}
                case 6 -> {}
                default -> {
                    System.err.println("Opción no válida, vuelva a intentarlo.");
                    methods.menuOp();
                    op = bufferReader.leerInt();
                }
            }
        }
        System.out.println("FIN DEL PROGRAMA, HASTA LUEGO.");

    }


}